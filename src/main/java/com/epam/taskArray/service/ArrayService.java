package com.epam.taskArray.service;

import com.epam.taskArray.entity.CurrentArray;
import com.epam.taskArray.exception.ArrayException;

public class ArrayService {

    public int searchMinElement(CurrentArray currentArray) {
        int min = Integer.MAX_VALUE;
        try {
            for (int i = 0; i < currentArray.sizeArray(); i++) {
                if (currentArray.arrayGetElement(i) < min) {
                    min = currentArray.arrayGetElement(i);
                }
            }
        } catch (ArrayException arrayException) {
            System.out.println("Error");
        }
        return min;
    }

    public int searchMaxElement(CurrentArray currentArray) throws ArrayException {
        int max = Integer.MIN_VALUE;
        try {
            for (int i = 0; i < currentArray.sizeArray(); i++) {
                if (currentArray.arrayGetElement(i) > max) {
                    max = currentArray.arrayGetElement(i);
                }
            }
        } catch (ArrayException arrayException) {
            System.out.println("Error");
        }
        return max;
    }

    public CurrentArray replace(CurrentArray currentArray, int element, int replaceable) throws ArrayException {
        for (int i = 0; i < currentArray.sizeArray(); i++) {
            if (currentArray.arrayGetElement(i) == element) {
                currentArray.setElement(i, replaceable);
            }
        }
        return currentArray;
    }

    public int sumElementsArray(CurrentArray currentArray) throws ArrayException {
        int sum = 0;
        for (int i = 0; i < currentArray.sizeArray(); i++) {
            sum += currentArray.arrayGetElement(i);
        }
        return sum;
    }

    public double averageElementsBy(CurrentArray currentArray) throws ArrayException {
        double average = sumElementsArray(currentArray) / currentArray.sizeArray();
        return average;
    }

    public int countPositive(CurrentArray currentArray) throws ArrayException {
        int countPositive = 0;
        for (int i = 0; i < currentArray.sizeArray(); i++) {
            if (currentArray.arrayGetElement(i) > 0) {
                countPositive++;
            }
        }
        return countPositive;
    }

    public int countNegative(CurrentArray currentArray) throws ArrayException {
        int countNegative = 0;
        for (int i = 0; i < currentArray.sizeArray(); i++) {
            if (currentArray.arrayGetElement(i) < 0) {
                countNegative++;
            }
        }
        return countNegative;
    }

    public void sortArraySelection(CurrentArray currentArray) throws ArrayException {
        for (int i = 0; i < currentArray.sizeArray(); i++) {
            for (int j = i; j < currentArray.sizeArray(); j++) {
                if (currentArray.arrayGetElement(i) > currentArray.arrayGetElement(j)) {
                    int temp = currentArray.arrayGetElement(j);
                    currentArray.setElement(j, currentArray.arrayGetElement(i));
                    currentArray.setElement(i, temp);
                }
            }
        }
    }

    public void sortArrayBubble(CurrentArray currentArray) throws ArrayException {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < currentArray.sizeArray(); i++) {
                if (currentArray.arrayGetElement(i) < currentArray.arrayGetElement(i - 1)) {
                    int temp = currentArray.arrayGetElement(i);
                    currentArray.setElement(i, currentArray.arrayGetElement(i - 1));
                    currentArray.setElement(i - 1, temp);
                    needIteration = true;
                }
            }
        }
    }

    public void sortArrayInsertion(CurrentArray currentArray) throws ArrayException {
        for (int i = 0; i < currentArray.sizeArray(); i++) {
            int value = currentArray.arrayGetElement(i);
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < currentArray.arrayGetElement(j)) {
                    currentArray.setElement(j + 1, j);
                } else {
                    break;
                }
            }
            currentArray.setElement(j + 1, value);
        }
    }


}
