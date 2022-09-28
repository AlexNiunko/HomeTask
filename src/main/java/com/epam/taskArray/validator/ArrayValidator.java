package com.epam.taskArray.validator;

public class ArrayValidator {
    public static final String STRING_INTEGER_REGEX="(\\d+\\,\\s)+\\d+";
    public boolean arrayDataValidator(String string){
        return string.matches(STRING_INTEGER_REGEX);
    }
}
