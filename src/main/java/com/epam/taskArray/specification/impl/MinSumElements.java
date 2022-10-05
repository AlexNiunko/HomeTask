package com.epam.taskArray.specification.impl;

import com.epam.taskArray.entity.CurrentArray;
import com.epam.taskArray.exception.ArrayException;
import com.epam.taskArray.service.impl.ArrayService;
import com.epam.taskArray.specification.Specification;

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
