package com.epam.array.validator.impl;

import com.epam.array.validator.ArrayValidatorImpl;

public class ArrayValidator implements ArrayValidatorImpl {
    public static final String STRING_INTEGER_REGEX="(\\d+\\,\\s)+\\d+";


    @Override
    public boolean arrayDataValidate(String string) {
        return false;
    }
}
