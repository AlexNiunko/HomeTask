package com.epam.array.comparator;

import com.epam.array.entity.CurrentArray;

import java.util.Comparator;

public class ComparatorSize implements Comparator<CurrentArray> {
    @Override
    public int compare(CurrentArray o1, CurrentArray o2) {
        return o2.sizeArray()- o1.sizeArray();
    }
}
