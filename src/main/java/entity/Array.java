package entity;

import exception.ArrayException;

import java.util.Arrays;

public class Array {
    private int [] Arr;

    public Array(){
        super();
    }

    public Array(int[] arr) {
        Arr = arr;
    }

    public Array(int length) throws ArrayException {
        if (length<0){
            throw new ArrayException("Отрицательная длинна");
        }
        this.Arr=new int[length];
    }
    public int arrayGetElement(int index) throws ArrayException {
        if (cheackRange(index)) {
            return Arr[index];
        } else {
            throw new ArrayException("Non-existent element");
        }
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
    public void setElement(int index,int value) throws ArrayException {
        if (cheackRange(index)) {
            this.Arr[index] = value;
        } else {
            throw new ArrayException("Non-existent element");
        }
    }
    public boolean cheackRange(int i){
        return  (i>=0 && i<Arr.length);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Array array = (Array) o;

        return Arrays.equals(Arr, array.Arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(Arr);
    }

    @Override
    public String toString() {
        return "Array{" +
                "Arr=" + Arrays.toString(Arr) +
                '}';
    }
}
