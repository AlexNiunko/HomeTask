package com.epam.array.specification;

import com.epam.array.entity.CurrentArray;
import com.epam.array.exception.ArrayException;

public interface Specification {
    boolean specify(CurrentArray array) throws ArrayException;

}
