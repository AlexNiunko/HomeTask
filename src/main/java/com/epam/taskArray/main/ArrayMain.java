package com.epam.taskArray.main;

import com.epam.taskArray.entity.CurrentArray;
import com.epam.taskArray.exception.ArrayException;
import com.epam.taskArray.service.ArrayService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class ArrayMain {
    static final Logger logger= (Logger) LogManager.getLogger();
    public static void main(String[] args) throws ArrayException {
        logger.log(Level.INFO,"start program");
//        ArrayFileReader arrayFileReader=new ArrayFileReader();
//        String str=arrayFileReader.readFromFile("data\\info.txt");
//        System.out.println(str);
//        ArrayValidator arrayValidator=new ArrayValidator();
//        System.out.println(arrayValidator.arrayDataValidator(str));
        int [] array={3,2,6,4,7,1,1,0};
        CurrentArray currentArray=new CurrentArray(array);
        ArrayService arrayService=new ArrayService();
        System.out.println(arrayService.sortArrayInsertion(currentArray));

    }
}
