package com.epam.array.observer.impl;

import com.epam.array.entity.CurrentArray;
import com.epam.array.entity.MathParams;
import com.epam.array.entity.WarehouseArray;
import com.epam.array.exception.ArrayException;
import com.epam.array.observer.ArrayObserver;

public class ArrayObserverImpl implements ArrayObserver {

    @Override
    public void updateArray(CurrentArray array)  {
        MathParams params=new MathParams();
        WarehouseArray warehouseArray=WarehouseArray.getInstance();
        try {
            params.setMathParams(array);
        } catch (ArrayException e) {
            e.printStackTrace();
        }
        warehouseArray.put(array.getId(), params);
    }
}
