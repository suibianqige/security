package io.renren.common.annotation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy=PhoneValidator.class)
public @interface Phone {
    String message() default "手机格式不正确！";

    Class<?>[] groups() default {};

    // 没加default给定默认值，使用注解的时候该属性必须赋值，否则报错
    String regex();

    Class<? extends Payload>[] payload() default { };
}




