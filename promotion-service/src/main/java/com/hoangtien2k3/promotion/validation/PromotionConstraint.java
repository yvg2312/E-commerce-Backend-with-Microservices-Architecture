package com.hoangtien2k3.promotion.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = PromotionValidator.class)
public @interface PromotionConstraint {
    String message() default "Promotion is invalid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
