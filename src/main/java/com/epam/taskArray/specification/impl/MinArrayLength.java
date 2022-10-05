package com.epam.taskArray.specification.impl;

import com.epam.taskArray.entity.CurrentArray;
import com.epam.taskArray.specification.Specification;

public class MinArrayLength implements Specification {
    private int minLength;

    public MinArrayLength(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean specify(CurrentArray array) {
        return (array.sizeArray()<minLength);
    }
}
