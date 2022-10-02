package com.epam.taskArray.service;

import com.epam.taskArray.entity.CurrentArray;
import com.epam.taskArray.exception.ArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayService {
    static final Logger logger= LogManager.getLogger();
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
        logger.log(Level.INFO,"the minimum element of a given array is "+min);
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
        logger.log(Level.INFO,"the maximum element of a given array is "+max);
        return max;
    }

    public CurrentArray replace(CurrentArray currentArray, int element, int replaceable) throws ArrayException {
        for (int i = 0; i < currentArray.sizeArray(); i++) {
            if (currentArray.arrayGetElement(i) == element) {
                currentArray.setElement(i, replaceable);
            }
        }
        logger.log(Level.INFO,"In the specified array, the "+element+" element has been replaced with the "+replaceable +" element ");
        return currentArray;
    }

    public int sumElementsArray(CurrentArray currentArray) throws ArrayException {
        int sum = 0;
        for (int i = 0; i < currentArray.sizeArray(); i++) {
            sum += currentArray.arrayGetElement(i);
        }
        logger.log(Level.INFO,"the sum of the elements of a given array is equal to "+sum);
        return sum;
    }

    public double averageElementsBy(CurrentArray currentArray) throws ArrayException {
        double average = sumElementsArray(currentArray) / currentArray.sizeArray();
        logger.log(Level.INFO,"the average of the elements of a given array is equal to "+average);
        return average;
    }

    public int countPositive(CurrentArray currentArray) throws ArrayException {
        int countPositive = 0;
        for (int i = 0; i < currentArray.sizeArray(); i++) {
            if (currentArray.arrayGetElement(i) > 0) {
                countPositive++;
            }
        }

        logger.log(Level.INFO,"the number of positive elements is equal to "+countPositive);
        return countPositive;
    }

    public int countNegative(CurrentArray currentArray) throws ArrayException {
        int countNegative = 0;
        for (int i = 0; i < currentArray.sizeArray(); i++) {
            if (currentArray.arrayGetElement(i) < 0) {
                countNegative++;
            }
        }
        logger.log(Level.INFO,"the number of negative elements is equal to "+countNegative);
        return countNegative;
    }

    public CurrentArray sortArraySelection(CurrentArray currentArray) throws ArrayException {
        for (int i = 0; i < currentArray.sizeArray(); i++) {
            for (int j = i; j < currentArray.sizeArray(); j++) {
                if (currentArray.arrayGetElement(i) > currentArray.arrayGetElement(j)) {
                    int temp = currentArray.arrayGetElement(j);
                    currentArray.setElement(j, currentArray.arrayGetElement(i));
                    currentArray.setElement(i, temp);
                }
            }
        }
        logger.log(Level.INFO,"this array is sorted by the selection method");
        return currentArray;
    }

    public CurrentArray sortArrayBubble(CurrentArray currentArray) throws ArrayException {
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
        logger.log(Level.INFO,"this array is sorted by the bubble method");
        return currentArray;
    }

    public CurrentArray sortArrayInsertion(CurrentArray currentArray) throws ArrayException {
        for (int i = 0; i < currentArray.sizeArray(); i++) {
            int value = currentArray.arrayGetElement(i);
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < currentArray.arrayGetElement(j)) {
                    currentArray.setElement(j + 1, currentArray.arrayGetElement(j));
                } else {
                    break;
                }
            }
            currentArray.setElement(j + 1, value);
        }
        logger.log(Level.INFO,"this array is sorted by the insertion method");
        return currentArray;
    }
}
