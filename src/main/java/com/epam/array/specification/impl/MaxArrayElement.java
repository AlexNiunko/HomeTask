package com.epam.array.specification.impl;

import com.epam.array.entity.CurrentArray;
import com.epam.array.exception.ArrayException;
import com.epam.array.service.impl.ArrayService;
import com.epam.array.specification.Specification;

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
