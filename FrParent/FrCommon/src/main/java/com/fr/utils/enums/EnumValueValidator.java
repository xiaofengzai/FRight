package com.fr.utils.enums;

/**
 * Created by szty on 2018/6/21.
 */
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EnumValueValidator implements ConstraintValidator<EnumValue, Integer> {
    private Class<? extends EnumMessage<Integer>> enumClass;
    private boolean nullable=false;

    @Override
    public void initialize(EnumValue enumValue) {
        enumClass = enumValue.enumClass();
        nullable=enumValue.nullable();
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        if(nullable && null==integer)
            return true;
        return EnumUtils.isValidValue(integer,enumClass);
    }
}

