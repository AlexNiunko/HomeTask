package com.epam.array.specification.impl;

import com.epam.array.entity.CurrentArray;
import com.epam.array.exception.ArrayException;
import com.epam.array.service.impl.ArrayService;
import com.epam.array.specification.Specification;

public class MinSumElements implements Specification {
    private int minSum;

    public MinSumElements(int minSum) {
        this.minSum = minSum;
    }

    @Override
    public boolean specify(CurrentArray array) throws ArrayException {
        ArrayService arrayService=new ArrayService();
        return (arrayService.sumElementsArray(array) < minSum);
    }
}
