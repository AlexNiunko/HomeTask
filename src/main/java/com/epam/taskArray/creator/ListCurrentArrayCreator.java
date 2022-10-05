package com.epam.taskArray.creator;

import com.epam.taskArray.entity.CurrentArray;
import com.epam.taskArray.exception.ArrayException;
import com.epam.taskArray.parser.ListParser;
import com.epam.taskArray.reader.AllFileArrayReader;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ListCurrentArrayCreator {
    public List<CurrentArray> currentArrayList(String path) throws ArrayException {
        AllFileArrayReader allFileArrayReader=new AllFileArrayReader();
        List<String>stringList= allFileArrayReader.readFromFile(path);
        ListParser listParser=new ListParser();
        List<int []>arraysInt=new ArrayList<>(listParser.listParser(stringList));
        List<CurrentArray> currentArrayList=new ArrayList<>();
        for (int i = 0; i < arraysInt.size(); i++) {
            currentArrayList.add(new CurrentArray(arraysInt.get(i), UUID.randomUUID().toString()));
        }
        return currentArrayList;
    }
}
