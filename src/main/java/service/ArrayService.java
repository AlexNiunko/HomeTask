package service;

import entity.Array;
import exception.ArrayException;


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


}
