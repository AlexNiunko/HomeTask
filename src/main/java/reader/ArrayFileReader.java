package reader;

import entity.Array;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArrayFileReader {
    public Array readFromFile()  {
        String str=null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("readme.txt"));
            str=bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayConsoleReader arrayConsoleReader=new ArrayConsoleReader();
        Array array=new Array(arrayConsoleReader.numberTostring(str));
        return array;
    }
}
