package com.epam.taskArray.creator;

import com.epam.taskArray.entity.CurrentArray;
import com.epam.taskArray.exception.ArrayException;
import org.apache.logging.log4j.LogManager;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayCreator {
    static final Logger logger= (Logger) LogManager.getLogger();
    public void fillRandomized(CurrentArray currentArray, int minValue, int maxValue) throws ArrayException {
        Random random = new Random();
        for (int i = 0; i <currentArray.sizeArray(); i++) {
            int value = random.nextInt(maxValue - minValue + 1) + minValue;
            currentArray.setElement(i, value);
        }
        logger.log(Level.INFO,"the array is full");
    }
}
