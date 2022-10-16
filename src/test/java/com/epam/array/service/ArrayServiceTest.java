package com.epam.array.service;

import com.epam.array.entity.CurrentArray;
import com.epam.array.exception.ArrayException;
import com.epam.array.service.impl.ArrayService;
import org.testng.Assert;
import org.testng.annotations.*;

public class ArrayServiceTest {
    private int[] array = {1, 5, 6, 98, -4, -54, -4, 1, -12};
    ArrayService arrayService;
    CurrentArray currentArray;


    @BeforeClass
    public void beforeClass() throws ArrayException {
        System.out.println("Start ArrayServiceTest");
        arrayService = new ArrayService();
        currentArray = new CurrentArray(array);
    }

    @AfterClass
    public void afterClass() {
        arrayService = null;
        currentArray = null;
    }

    @Test
    public void testSearchMaxElement() throws ArrayException {
        int expected = 98;
        int actual = arrayService.searchMaxElement(currentArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSearchMinElement() throws ArrayException {
        int expected = -54;
        int actual = arrayService.searchMinElement(currentArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSumElementsArray() throws ArrayException {
        int expected = 37;
        int actual = arrayService.sumElementsArray(currentArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testAverageElementsBy() throws ArrayException {
        double expected = 4.0;
        double actual = arrayService.averageElementsBy(currentArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCountPositive() throws ArrayException {
        int expected = 5;
        int actual = arrayService.countPositive(currentArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCountNegative() throws ArrayException {
        int expected = 4;
        int actual = arrayService.countNegative(currentArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSortArrayBubble() throws ArrayException {
        int[] expected = {-54, -12, -4, -4, 1, 1, 5, 6, 98};
        CurrentArray expect = new CurrentArray(expected, 123L);
        Assert.assertEquals(arrayService.sortArrayBubble(currentArray), expect);
    }

    @Test
    public void testSortArraySelection() throws ArrayException {
        int[] expect = {-54, -12, -4, -4, 1, 1, 5, 6, 98};
        CurrentArray expected = new CurrentArray(expect, 123L);
        Assert.assertEquals(arrayService.sortArraySelection(currentArray), expected);
    }

    @Test
    public void testSortArrayInsertion() throws ArrayException {
        int[] expect = {-54, -12, -4, -4, 1, 1, 5, 6, 98};
        CurrentArray expected = new CurrentArray(expect, 123L);
        Assert.assertEquals(arrayService.sortArrayInsertion(currentArray), expected);
    }
}