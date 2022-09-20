package service;

import entity.Array;

import java.util.Arrays;

public class ArrayService {

    public int searchMinElement(Array array){
        int min= Integer.MAX_VALUE;
        for (int i = 0; i < array.sizeArray(); i++) {
            if (array.arrayGetElement(i)<min) {
                min=array.arrayGetElement(i);
            }
        }
        return min;
    }
    public int searchMaxElement(Array array){
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < array.sizeArray(); i++) {
            if (array.arrayGetElement(i)>max) {
                max=array.arrayGetElement(i);
            }
        }
        return max;
    }
    public Array replace(Array  array, int element, int replaceable){
        for (int i = 0; i < array.sizeArray(); i++) {
            if (array.arrayGetElement(i)==element){
                array.setElement(i,replaceable);
            }
        }
        return array;
    }
    public int sumElementsArray(Array array){
        int sum=0;
        for (int i = 0; i < array.sizeArray(); i++) {
            sum+=array.arrayGetElement(i);
        }
        return sum;
    }
    public double averageElementsBy(Array array){
        double average=sumElementsArray(array)/array.sizeArray();
        return average;
    }


}
