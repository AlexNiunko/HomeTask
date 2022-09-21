package main;

import creator.ArrayCreator;
import entity.Array;
import exception.ArrayException;
import service.ArrayService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ArrayException {
        ArrayCreator arrayCreator=new ArrayCreator();
        Array array=new Array(6);
        arrayCreator.fillRandomized(array,-20,20);
        ArrayService arrayService=new ArrayService();
        arrayService.replace(array,2,0);
        System.out.println(array);
        System.out.println(arrayService.searchMaxElement(array));
        System.out.println(arrayService.searchMinElement(array));
        System.out.println(arrayService.averageElementsBy(array));
        System.out.println(arrayService.countPositive(array));
        System.out.println(arrayService.countNegative(array));

    }
}
