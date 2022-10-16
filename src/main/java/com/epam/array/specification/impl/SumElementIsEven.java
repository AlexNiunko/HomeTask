package com.epam.array.specification.impl;

import com.epam.array.entity.CurrentArray;
import com.epam.array.exception.ArrayException;
import com.epam.array.service.impl.ArrayService;
import com.epam.array.specification.Specification;

public class SumElementIsEven implements Specification {

    @Override
    public boolean specify(CurrentArray array) throws ArrayException {
        ArrayService service=new ArrayService();
        return (service.sumElementsArray(array)%2==0) ;
    }
}
