package com.epam.taskArray.main;

import com.epam.taskArray.entity.Array;
import com.epam.taskArray.exception.ArrayException;
import com.epam.taskArray.reader.ArrayFileReader;

public class Main {
    public static void main(String[] args) throws ArrayException {
        Array array=new ArrayFileReader().readFromFile();
        System.out.println(array);
    }
}
