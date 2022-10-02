package com.epam.taskArray.parser;

import java.util.ArrayList;
import java.util.List;

public class ListParser {
    public List<int []> listParser(List<String>stringList){
        ArrayParser arrayParser=new ArrayParser();
        List<int []>arraysInt=new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            arraysInt.add(arrayParser.arrayParser(stringList.get(i)));
        }
        return arraysInt;
    }
}
