package com.hoangtien2k3.commonlib.model;

import com.hoangtien2k3.commonlib.model.listener.CustomAuditingEntityListener;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import java.time.ZonedDateTime;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

@MappedSuperclass
@Getter
@Setter
@EntityListeners(CustomAuditingEntityListener.class)
public class AbstractAuditEntity {

    @CreationTimestamp
    private ZonedDateTime createdOn;

    @CreatedBy
    private String createdBy;

    @UpdateTimestamp
    private ZonedDateTime lastModifiedOn;

    @LastModifiedBy
    private String lastModifiedBy;
}