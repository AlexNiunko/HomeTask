package com.epam.taskArray.validator.impl;

import com.epam.taskArray.validator.ArrayValidatorImpl;

public class ArrayValidator implements ArrayValidatorImpl {
    public static final String STRING_INTEGER_REGEX="(\\d+\\,\\s)+\\d+";


    @Override
    public boolean arrayDataValidate(String string) {
        return false;
    }
}
