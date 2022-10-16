package com.epam.array.comparator;

import com.epam.array.entity.CurrentArray;
import com.epam.array.exception.ArrayException;

import java.util.Comparator;

public class ComparatorFirstElement implements Comparator<CurrentArray> {
    @Override
    public int compare(CurrentArray o1, CurrentArray o2) {
        int temp=0;
        try {
            temp= (o1.arrayGetElement(0)-o2.arrayGetElement(0));
        } catch (ArrayException e) {
            e.printStackTrace();
        }
        return temp;
    }
}
