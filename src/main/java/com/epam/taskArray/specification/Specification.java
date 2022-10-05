package com.epam.taskArray.specification;

import com.epam.taskArray.entity.CurrentArray;
import com.epam.taskArray.exception.ArrayException;

public interface Specification {
    boolean specify(CurrentArray array) throws ArrayException;
}
