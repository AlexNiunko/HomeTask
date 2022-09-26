package com.epam.taskArray.service;

import com.epam.taskArray.entity.Array;
import com.epam.taskArray.exception.ArrayException;


public class ArrayService {

    public int searchMinElement(Array array) throws ArrayException {
        int min= Integer.MAX_VALUE;
        for (int i = 0; i < array.sizeArray(); i++) {
            if (array.arrayGetElement(i)<min) {
                min=array.arrayGetElement(i);
            }
        }
        return min;
    }
    public int searchMaxElement(Array array) throws ArrayException {
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < array.sizeArray(); i++) {
            if (array.arrayGetElement(i)>max) {
                max=array.arrayGetElement(i);
            }
        }
        return max;
    }
    public Array replace(Array  array, int element, int replaceable) throws ArrayException {
        for (int i = 0; i < array.sizeArray(); i++) {
            if (array.arrayGetElement(i)==element){
                array.setElement(i,replaceable);
            }
        }
        return array;
    }
    public int sumElementsArray(Array array) throws ArrayException {
        int sum=0;
        for (int i = 0; i < array.sizeArray(); i++) {
            sum+=array.arrayGetElement(i);
        }
        return sum;
    }
    public double averageElementsBy(Array array) throws ArrayException {
        double average=sumElementsArray(array)/array.sizeArray();
        return average;
    }
    public int countPositive(Array array) throws ArrayException {
        int countPositive=0;
        for (int i = 0; i < array.sizeArray(); i++) {
            if (array.arrayGetElement(i)>0){
                countPositive++;
            }
        }
        return countPositive;
    }
    public int countNegative(Array array) throws ArrayException {
        int countNegative=0;
        for (int i = 0; i < array.sizeArray(); i++) {
            if (array.arrayGetElement(i)<0){
                countNegative++;
            }
        }
        return countNegative;
    }
    public void sortArraySelection(Array array) throws ArrayException {
        for (int i = 0; i < array.sizeArray(); i++) {
            for (int j = i; j <array.sizeArray() ; j++) {
                if (array.arrayGetElement(i)>array.arrayGetElement(j)){
                    int temp=array.arrayGetElement(j);
                    array.setElement(j,array.arrayGetElement(i));
                    array.setElement(i,temp);
                }
            }
        }
    }
    public void sortArrayBubble(Array array) throws ArrayException {
        boolean needIteration=true;
        while (needIteration){
            needIteration=false;
            for (int i = 1; i < array.sizeArray(); i++) {
                if (array.arrayGetElement(i)<array.arrayGetElement(i-1)){
                    int temp=array.arrayGetElement(i);
                    array.setElement(i,array.arrayGetElement(i-1));
                    array.setElement(i-1,temp);
                    needIteration=true;
                }
            }
        }
    }
    public void sortArrayInsertion(Array array) throws ArrayException {
        for (int i = 0; i < array.sizeArray(); i++) {
            int value=array.arrayGetElement(i);
            int j=i-1;
            for (; j >=0 ; j--) {
                if (value<array.arrayGetElement(j)){
                    array.setElement(j+1,j);
                } else {
                    break;
                }
            }
            array.setElement(j+1,value);
        }
    }




}
