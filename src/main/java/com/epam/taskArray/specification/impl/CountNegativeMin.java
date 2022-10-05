package com.epam.taskArray.specification.impl;

import com.epam.taskArray.entity.CurrentArray;
import com.epam.taskArray.exception.ArrayException;
import com.epam.taskArray.service.impl.ArrayService;
import com.epam.taskArray.specification.Specification;

public class CountNegativeMin implements Specification {
    private int countNegative;

    public CountNegativeMin(int countNegative) {
        this.countNegative = countNegative;
    }

    @Override
    public boolean specify(CurrentArray array) throws ArrayException {
        ArrayService service=new ArrayService();
        return (service.countNegative(array)<countNegative);
    }
}
