package com.epam.taskArray.reader;

import com.epam.taskArray.exception.ArrayException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AllFileArrayReader {
    public List<String> readFromFile(String pathOrFileName) throws ArrayException {
        String str="";
        List<String>stringList=new ArrayList<>();
        try(FileReader fileReader=new FileReader(pathOrFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            List<String> listString=new ArrayList<>();
            while ((str= bufferedReader.readLine())!=null) {
                listString.add(str);
            }
         return listString;
        } catch (FileNotFoundException e) {
            throw new ArrayException("This file does not exist");
        } catch (IOException e) {
            throw new ArrayException("Unable to read this file");
        }
    }
}

