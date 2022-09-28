package com.epam.taskArray.reader;

import com.epam.taskArray.exception.ArrayException;

import java.io.*;

public class ArrayFileReader {
    public String readFromFile(String pathOrFileName) throws ArrayException {
       String str="";
        try(FileReader fileReader=new FileReader(pathOrFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            str=bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            throw new ArrayException("This file does not exist");
        } catch (IOException e) {
            throw new ArrayException("Unable to read this file");
        }
        return str;
    }
}
