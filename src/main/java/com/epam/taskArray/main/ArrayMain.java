package com.epam.taskArray.main;

import com.epam.taskArray.entity.CurrentArray;
import com.epam.taskArray.exception.ArrayException;
import com.epam.taskArray.creator.ListCurrentArrayCreator;
import com.epam.taskArray.repository.Repository;
import com.epam.taskArray.specification.Specification;
import com.epam.taskArray.specification.impl.SumElementIsEven;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.ArrayList;
import java.util.List;

public class ArrayMain {
    static final Logger logger= (Logger) LogManager.getLogger();
    public static void main(String[] args) throws ArrayException {
        logger.log(Level.INFO,"start program");
        ListCurrentArrayCreator listCurrentArrayCreator=new ListCurrentArrayCreator();
        List<CurrentArray>currentArrayList=new ArrayList<>(listCurrentArrayCreator.currentArrayList("data\\info.txt"));
        Repository repository=Repository.getInstance(currentArrayList);
        System.out.println(repository);
        Specification specification=new SumElementIsEven();
        List<CurrentArray>res= repository.query(specification);
        System.out.println(res);

    }
}
