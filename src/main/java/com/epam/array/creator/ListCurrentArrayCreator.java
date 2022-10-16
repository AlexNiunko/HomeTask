package com.epam.array.creator;

import com.epam.array.entity.CurrentArray;
import com.epam.array.exception.ArrayException;
import com.epam.array.parser.ListParser;
import com.epam.array.reader.impl.AllFileArrayReader;

import java.util.ArrayList;
import java.util.List;

public class ListCurrentArrayCreator {
    public List<CurrentArray> currentArrayList(String path) throws ArrayException {
        AllFileArrayReader allFileArrayReader=new AllFileArrayReader();
        List<String>stringList= allFileArrayReader.readFromFile(path);
        ListParser listParser=new ListParser();
        List<int []>arraysInt=new ArrayList<>(listParser.parse(stringList));
        List<CurrentArray> currentArrayList=new ArrayList<>();
        for (int i = 0; i < arraysInt.size(); i++) {
            currentArrayList.add(new CurrentArray(arraysInt.get(i), idGenerate(arraysInt.get(i))));
        }
        return currentArrayList;
    }
    private long idGenerate(int [] array){
        return (array.length*array[0]-array[array.length-1]);
    }
}
