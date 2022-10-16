package com.epam.array.comparator;

import com.epam.array.entity.CurrentArray;

import java.util.Comparator;

public class ComparatorID implements Comparator<CurrentArray> {
    @Override
    public int compare(CurrentArray o1, CurrentArray o2) {
        return (int) (o1.getId()- o2.getId());
    }
}
