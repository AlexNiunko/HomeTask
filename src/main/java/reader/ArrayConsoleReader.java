package reader;

import entity.Array;

import java.util.Scanner;

public class ArrayConsoleReader {
    public static final String SPACE_DELMETER="\\s+";
    public static final String NUMBER_EXPRESSION="\\d+";

    public Array readFromConsole()  {
        String str;
        try(Scanner scanner = new Scanner(System.in);) {
            str = scanner.nextLine();
        }
        Array array=new Array(numberTostring(str));
        return array;
    }


    public int[] numberTostring(String str){
        String [] strNumbers=str.split(SPACE_DELMETER);
        int countItem=0;
        for (int i = 0; i < strNumbers.length; i++) {
            if (strNumbers[i].matches(NUMBER_EXPRESSION)){
                countItem++;
            }
        }
        int [] numbers=new int[countItem];
        for (int i = 0,j=0; i < strNumbers.length; i++) {
            if (strNumbers[i].matches(NUMBER_EXPRESSION)){
                numbers[j]=Integer.parseInt(strNumbers[i]);
                j++;
            }
        }
        return numbers;
    }
}
