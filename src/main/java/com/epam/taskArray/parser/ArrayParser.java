package com.epam.taskArray.parser;

public class ArrayParser {
    public static final String SPACE_DELIMETER = "\\s+";
    public static final String NUMBER_EXPRESSION = "\\d+";

    public int [] arrayParser(String string) {
        String[] strNumbers = string.split(SPACE_DELIMETER);
        int countItem = 0;
        for (int i = 0; i < strNumbers.length; i++) {
            if (strNumbers[i].matches(NUMBER_EXPRESSION)) {
                countItem++;
            }
        }
         int [] numbers = new int [countItem];
        for (int i = 0, j = 0; i < strNumbers.length; i++) {
            if (strNumbers[i].matches(NUMBER_EXPRESSION)) {
                numbers[j] = Integer.parseInt(strNumbers[i]);
                j++;
            }
        }
        return numbers;
    }
}
