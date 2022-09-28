package com.epam.taskArray.validator;

public class ArrayValidator {
    public static final String stringIntegerRegex="(\\d+\\,\\s)+\\d+";
    public boolean arrayDataValidator(String string){
        return string.matches(stringIntegerRegex);
    }
}
