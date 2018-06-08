package io.renren.common.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<Phone, String> {
    String regex;
    @Override
    public void initialize(Phone phone) {
        this.regex = phone.regex();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if ("".equals(s) || s == null) {
            return true;
        }
        // 进行正则校验
        if(s.matches(regex)) {
            return true;
        }
        return false;
    }
}
