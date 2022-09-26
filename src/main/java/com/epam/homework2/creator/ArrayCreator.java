package com.epam.homework2.creator;

import com.epam.homework2.entity.Array;
import com.epam.homework2.exception.ArrayException;

public class ArrayCreator {
    public void fillRandomized(Array array,int minValue,int maxValue) throws ArrayException {
        int arrayLength= array.sizeArray();
        for (int i = 0; i < arrayLength; i++) {
            int value=(int) (Math.random()*(maxValue-minValue)+minValue);
            array.setElement(i,value);
        }
    }
}
