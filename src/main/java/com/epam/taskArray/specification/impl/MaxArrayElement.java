package com.epam.taskArray.specification.impl;

import com.epam.taskArray.entity.CurrentArray;
import com.epam.taskArray.exception.ArrayException;
import com.epam.taskArray.service.impl.ArrayService;
import com.epam.taskArray.specification.Specification;

public class MaxArrayElement  implements Specification {
    private int maxElement;

    public MaxArrayElement(int maxElement) {
        this.maxElement = maxElement;
    }

    @Override
    public boolean specify(CurrentArray array) throws ArrayException {
        ArrayService service=new ArrayService();
        return (service.searchMaxElement(array)>maxElement);
    }
}
