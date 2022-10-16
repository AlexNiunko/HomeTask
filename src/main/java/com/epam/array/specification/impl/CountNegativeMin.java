package com.epam.array.specification.impl;

import com.epam.array.entity.CurrentArray;
import com.epam.array.exception.ArrayException;
import com.epam.array.service.impl.ArrayService;
import com.epam.array.specification.Specification;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CountNegativeMin{");
        sb.append("countNegative=").append(countNegative);
        sb.append('}');
        return sb.toString();
    }
}
