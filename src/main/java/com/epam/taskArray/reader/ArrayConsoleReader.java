package com.epam.taskArray.reader;

import java.util.Scanner;

public class ArrayConsoleReader {
    public static final String SPACE_DELIMETER = "\\s+";
    public static final String NUMBER_EXPRESSION = "\\d+";

    public String readFromConsole() {
        String str;
        try (Scanner scanner = new Scanner(System.in)) {
            str = scanner.nextLine();
        }
        return str;
    }
}
