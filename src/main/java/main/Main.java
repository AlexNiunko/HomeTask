package main;

import creator.ArrayCreator;
import entity.Array;
import exception.ArrayException;
import reader.ArrayConsoleReader;
import reader.ArrayFileReader;
import service.ArrayService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ArrayException {
        Array array=new ArrayFileReader().readFromFile();
        System.out.println(array);
    }
}
