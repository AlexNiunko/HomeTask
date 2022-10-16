package com.epam.array.reader.impl;

import com.epam.array.reader.ConsoleReader;

import java.util.Scanner;

public class ArrayConsoleReader implements ConsoleReader {

    @Override
    public String readFromConsole() {
        String str;
        try (Scanner scanner = new Scanner(System.in)) {
            str = scanner.nextLine();
        }
        return str;
    }
}
