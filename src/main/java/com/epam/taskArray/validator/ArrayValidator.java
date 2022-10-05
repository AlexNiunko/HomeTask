package com.epam.taskArray.validator;

public class ArrayValidator implements ArrayValidatorimpl {
    public static final String STRING_INTEGER_REGEX="(\\d+\\,\\s)+\\d+";
    @Override
    public boolean arrayDataValidator(String string){
        return string.matches(STRING_INTEGER_REGEX);
    }
}
