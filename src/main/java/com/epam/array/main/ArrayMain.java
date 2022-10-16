package com.epam.array.main;

import com.epam.array.entity.MathParams;
import com.epam.array.entity.WarehouseArray;
import com.epam.array.exception.ArrayException;
import com.epam.array.repository.ArrayRepository;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class ArrayMain {
    static final Logger logger= (Logger) LogManager.getLogger();
    public static void main(String[] args) throws ArrayException {
        logger.log(Level.INFO,"start program");
        ArrayRepository arrayRepository = ArrayRepository.getInstance("data\\info.txt");
        System.out.println(arrayRepository);
        System.out.println(arrayRepository.getArray(300L));
        int [] newArr={1,1,1,1,1,1};
        arrayRepository.getArray(300L).setArr(newArr);
        MathParams params=new MathParams();

        params.setMathParams(arrayRepository.getArray(300L));
        WarehouseArray warehouse=WarehouseArray.getInstance();
        warehouse.put(300L,params);
        System.out.println(warehouse);
    }
}
