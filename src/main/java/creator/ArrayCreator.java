package creator;

import entity.Array;
import exception.ArrayException;

public class ArrayCreator {
    public void fillRandomized(Array array,int minValue,int maxValue) throws ArrayException {
        int arrayLength= array.sizeArray();
        for (int i = 0; i < arrayLength; i++) {
            int value=(int) (Math.random()*(maxValue-minValue)+minValue);
            array.setElement(i,value);
        }
    }
}
