package com.epam.taskArray.main;

import com.epam.taskArray.exception.ArrayException;
import com.epam.taskArray.reader.ArrayFileReader;
import com.epam.taskArray.validator.ArrayValidator;

public class ArrayMain {
    public static void main(String[] args) throws ArrayException {
        ArrayFileReader arrayFileReader=new ArrayFileReader();
        String str=arrayFileReader.readFromFile("data\\info.txt");
        System.out.println(str);
        ArrayValidator arrayValidator=new ArrayValidator();
        System.out.println(arrayValidator.arrayDataValidator(str));

    }
}
