package com.epam.taskArray.entity;

import com.epam.taskArray.exception.ArrayException;

import java.util.Arrays;

public class CurrentArray {
    private int[] arr;

    public CurrentArray() {
        super();
    }

    public CurrentArray(int[] arr) throws ArrayException {
        if (arr.length==0){
            throw new ArrayException("Array null");
        }
        this.arr = arr;
    }

    public CurrentArray(int length) throws ArrayException {
        if (length < 0) {
            throw new ArrayException("Negative length");
        }
        this.arr = new int[length];
    }

    public int arrayGetElement(int index) throws ArrayException {
        if (!(cheackRange(index))) {
            throw new ArrayException("Non-existent element");
        }
        return arr[index];
    }

    public int sizeArray() {
        return arr.length;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void setElement(int index, int value) throws ArrayException {
        if ( !(cheackRange(index)) ) {
            throw new ArrayException("Non-existent element");
        }
        this.arr[index] = value;
    }

    private boolean cheackRange(int i) {
        return (i >= 0 && i < arr.length);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CurrentArray that = (CurrentArray) o;

        return Arrays.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CurrentArray{");
        sb.append("arr=").append(Arrays.toString(arr));
        sb.append('}');
        return sb.toString();
    }
}
