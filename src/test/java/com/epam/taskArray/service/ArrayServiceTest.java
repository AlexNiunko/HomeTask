package com.epam.taskArray.service;

import com.epam.taskArray.entity.CurrentArray;
import com.epam.taskArray.exception.ArrayException;
import com.epam.taskArray.service.impl.ArrayService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayServiceTest {

    @Test
    public void testSearchMaxElement() throws ArrayException {
        int [] array={1,5,6,98};
        int expected=98;
        CurrentArray currentArray=new CurrentArray(array,"12");
        ArrayService arrayService=new ArrayService();
        int actual=arrayService.searchMaxElement(currentArray);
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void testSearchMinElement() throws ArrayException {
        int [] array={1,4,5,7,1,23};
        int expected=1;
        CurrentArray currentArray=new CurrentArray(array,"123");
        ArrayService arrayService=new ArrayService();
        int actual=arrayService.searchMinElement(currentArray);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSumElementsArray() throws ArrayException {
        int [] array={3,5,1,2,3};
        int expected=14;
        CurrentArray currentArray=new CurrentArray(array,"12");
        ArrayService arrayService=new ArrayService();
        int actual=arrayService.sumElementsArray(currentArray);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testAverageElementsBy() throws ArrayException {
        int [] array={1,2,3,4,5};
        double expected=3.0;
        CurrentArray currentArray=new CurrentArray(array,"12");
        ArrayService arrayService=new ArrayService();
        double actual=arrayService.averageElementsBy(currentArray);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testCountPositive() throws ArrayException {
        int [] array={1,-2,-3,-4,5};
        int expected=2;
        CurrentArray currentArray=new CurrentArray(array,"12");
        ArrayService arrayService=new ArrayService();
        int actual=arrayService.countPositive(currentArray);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testCountNegative() throws ArrayException {
        int [] array={-1,-2,-3,-4,5};
        int expected=4;
        CurrentArray currentArray=new CurrentArray(array,"123");
        ArrayService arrayService=new ArrayService();
        int actual=arrayService.countNegative(currentArray);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSortArrayBubble() throws ArrayException {
        int [] array={3,6,1,3,9};
        CurrentArray currentArray=new CurrentArray(array,"123");
        ArrayService arrayService=new ArrayService();
        int [] expected={1,3,3,6,9};
        CurrentArray expect=new CurrentArray(expected,"123");
        Assert.assertEquals(arrayService.sortArrayBubble(currentArray) , expect);
    }

    @Test
    public void testSortArraySelection() throws ArrayException {
        int [] array={4,3,2,7,89,0};
        CurrentArray currentArray=new CurrentArray(array,"123");
        ArrayService arrayService=new ArrayService();
        int [] expect={0,2,3,4,7,89};
        CurrentArray expected=new CurrentArray(expect,"123");
        Assert.assertEquals(arrayService.sortArraySelection(currentArray),expected);
    }

    @Test
    public void testSortArrayInsertion() throws ArrayException {
        int [] array={4,3,2,7,89,0};
        CurrentArray currentArray=new CurrentArray(array,"132");
        ArrayService arrayService=new ArrayService();
        int [] expect={0,2,3,4,7,89};
        CurrentArray expected=new CurrentArray(expect,"123");
        Assert.assertEquals(arrayService.sortArrayInsertion(currentArray),expected);
    }
}