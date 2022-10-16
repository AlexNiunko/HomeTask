package com.epam.array.parser;

import java.util.ArrayList;
import java.util.List;

public class ListParser {
    public List<int []> parse(List<String>stringList){
        ArrayParser parser=new ArrayParser();
        List<int []>arraysInt=new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            arraysInt.add(parser.arrayParser(stringList.get(i)));
        }
        return arraysInt;
    }
}
