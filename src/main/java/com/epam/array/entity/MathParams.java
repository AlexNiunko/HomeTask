package com.epam.array.entity;

import com.epam.array.exception.ArrayException;
import com.epam.array.service.impl.ArrayService;

public class MathParams {

    private int minValue;
    private int maxValue;
    private int sum;
    private double averageValue;


    public void  setMathParams(CurrentArray array) throws ArrayException {
        ArrayService service=new ArrayService();
        this.minValue = service.searchMinElement(array);
        this.maxValue = service.searchMaxElement(array);
        this.sum = service.sumElementsArray(array);
        this.averageValue =service.averageElementsBy(array);
    }

    public MathParams() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MathParams{");
        sb.append("minValue=").append(minValue);
        sb.append(", maxValue=").append(maxValue);
        sb.append(", sum=").append(sum);
        sb.append(", averageValue=").append(averageValue);
        sb.append('}');
        return sb.toString();
    }
}
