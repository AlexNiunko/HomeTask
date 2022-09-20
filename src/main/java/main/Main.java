package main;

import entity.Array;
import service.ArrayService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numberArr={2,3,4,5,1,3,5};
        Array array=new Array(numberArr);
        ArrayService arrayService=new ArrayService();
        arrayService.replace(array,2,0);
        System.out.println(array);
        System.out.println(arrayService.searchMaxElement(array));
        System.out.println(arrayService.searchMinElement(array));
        System.out.println(arrayService.averageElementsBy(array));

    }
}
