package com.epam.taskArray.creator;

import com.epam.taskArray.entity.CurrentArray;
import com.epam.taskArray.exception.ArrayException;

import java.util.Random;

public class ArrayCreator {
    public void fillRandomized(CurrentArray currentArray, int minValue, int maxValue) throws ArrayException {
        Random random = new Random();
        int arrayLength = currentArray.sizeArray();
        for (int i = 0; i < arrayLength; i++) {
            int value = random.nextInt(maxValue - minValue + 1) + minValue;
            currentArray.setElement(i, value);
        }
    }
}
