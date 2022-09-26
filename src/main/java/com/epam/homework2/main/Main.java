package com.epam.homework2.main;

import com.epam.homework2.entity.Array;
import com.epam.homework2.exception.ArrayException;
import com.epam.homework2.reader.ArrayFileReader;

public class Main {
    public static void main(String[] args) throws ArrayException {
        Array array=new ArrayFileReader().readFromFile();
        System.out.println(array);
    }
}
