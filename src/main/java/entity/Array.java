package entity;

import java.util.Arrays;

public class Array {
    private int [] Arr;

    public Array(int[] arr) {
        Arr = arr;
    }
    public int arrayGetElement(int index){
        return Arr[index];
    }
    public int sizeArray(){
        return Arr.length;
    }
    public int[] getArr() {
        return Arr;
    }
    public void setArr(int[] arr) {
        Arr = arr;
    }
    public void setElement(int index,int value){
         this.Arr[index]=value;
    }

    @Override
    public String toString() {
        return "Array{" +
                "Arr=" + Arrays.toString(Arr) +
                '}';
    }
}
