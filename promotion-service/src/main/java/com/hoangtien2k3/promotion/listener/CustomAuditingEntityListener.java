package com.hoangtien2k3.promotion.listener;

import com.hoangtien2k3.promotion.model.AbstractAuditEntity;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.auditing.AuditingHandler;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Configurable
public class CustomAuditingEntityListener extends AuditingEntityListener {

    public CustomAuditingEntityListener(ObjectFactory<AuditingHandler> handler) {
        super.setAuditingHandler(handler);
    }

    @Override
    @PrePersist
    public void touchForCreate(Object target) {
        AbstractAuditEntity entity = (AbstractAuditEntity) target;
        if (entity.getCreatedBy() == null) {
            super.touchForCreate(target);
        } else {
            if (entity.getLastModifiedBy() == null) {
                entity.setLastModifiedBy(entity.getCreatedBy());
            }
        }
    }

    @Override
    @PreUpdate
    public void touchForUpdate(Object target) {
        AbstractAuditEntity entity = (AbstractAuditEntity) target;
        if (entity.getLastModifiedBy() == null) {
            super.touchForUpdate(target);
        }
    }
}
