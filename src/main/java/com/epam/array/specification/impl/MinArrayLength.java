package com.epam.array.specification.impl;

import com.epam.array.entity.CurrentArray;
import com.epam.array.specification.Specification;

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
