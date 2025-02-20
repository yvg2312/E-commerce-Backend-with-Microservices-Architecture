package com.hoangtien2k3.promotion.model;

import com.hoangtien2k3.promotion.model.enumeration.ApplyTo;
import com.hoangtien2k3.promotion.model.enumeration.DiscountType;
import com.hoangtien2k3.promotion.model.enumeration.UsageType;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "promotion")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Builder
public class Promotion extends AbstractAuditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 450)
    private String name;

    private String slug;

    private String description;

    private String couponCode;

    @Enumerated(EnumType.STRING)
    private DiscountType discountType;

    @Enumerated(EnumType.STRING)
    private UsageType usageType;

    @Enumerated(EnumType.STRING)
    private ApplyTo applyTo;

    private int usageLimit;

    private int usageCount;

    private Long discountPercentage;

    private Long discountAmount;

    private Long minimumOrderPurchaseAmount;

    private Boolean isActive;

    private Instant startDate;

    private Instant endDate;

    @OneToMany(mappedBy = "promotion", cascade = CascadeType.ALL, orphanRemoval = true)
    List<PromotionApply> promotionApplies;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Promotion)) {
            return false;
        }
        return id != null && id.equals(((Promotion) o).id);
    }

    public void setPromotionApplies(List<PromotionApply> promotionApply) {
        if (this.promotionApplies == null) {
            this.promotionApplies = new ArrayList<>();
        }
        this.promotionApplies.clear();
        this.promotionApplies.addAll(promotionApply);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }
}
