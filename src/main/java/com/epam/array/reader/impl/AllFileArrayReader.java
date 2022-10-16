package com.epam.array.reader.impl;

import com.epam.array.exception.ArrayException;
import com.epam.array.reader.AllFileReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AllFileArrayReader implements AllFileReader {
    static final Logger logger= LogManager.getLogger();
    @Override
    public List<String> readFromFile(String pathOrFileName) throws ArrayException {
        String str = "";
        List<String> stringList = new ArrayList<>();
        try (FileReader fileReader = new FileReader(pathOrFileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            List<String> listString = new ArrayList<>();
            while ((str = bufferedReader.readLine()) != null) {
                listString.add(str);
            }
            return listString;
        } catch (FileNotFoundException e) {
            logger.log(Level.WARN,"This file does not exist "+pathOrFileName);
            throw new ArrayException("This file does not exist "+pathOrFileName);
        } catch (IOException e) {
            logger.log(Level.WARN,"Unable to read this file "+pathOrFileName);
            throw new ArrayException("Unable to read this file "+pathOrFileName);
        }
    }
}

