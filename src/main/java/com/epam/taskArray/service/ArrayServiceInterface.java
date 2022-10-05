package com.epam.taskArray.service;

import com.epam.taskArray.entity.CurrentArray;
import com.epam.taskArray.exception.ArrayException;

public interface ArrayServiceInterface {
    int searchMinElement(CurrentArray currentArray);

    int searchMaxElement(CurrentArray currentArray) throws ArrayException;

    CurrentArray replace(CurrentArray currentArray, int element, int replaceable) throws ArrayException;

    int sumElementsArray(CurrentArray currentArray) throws ArrayException;

    double averageElementsBy(CurrentArray currentArray) throws ArrayException;

    int countPositive(CurrentArray currentArray) throws ArrayException;

    int countNegative(CurrentArray currentArray) throws ArrayException;

    CurrentArray sortArraySelection(CurrentArray currentArray) throws ArrayException;

    CurrentArray sortArrayBubble(CurrentArray currentArray) throws ArrayException;

    CurrentArray sortArrayInsertion(CurrentArray currentArray) throws ArrayException;
}
