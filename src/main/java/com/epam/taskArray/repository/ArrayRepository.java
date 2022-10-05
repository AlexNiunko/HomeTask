package com.epam.taskArray.repository;

import com.epam.taskArray.entity.CurrentArray;
import com.epam.taskArray.exception.ArrayException;
import com.epam.taskArray.specification.Specification;

import java.util.ArrayList;
import java.util.List;

public class ArrayRepository {
    private static ArrayRepository arrayRepositoryInstance;
    private List<CurrentArray> list;

    private ArrayRepository(List<CurrentArray> currentArrayList) {
        this.list = currentArrayList;
    }

    public static ArrayRepository getInstance(List<CurrentArray> currentArrayList) {
        if (arrayRepositoryInstance == null) {
            arrayRepositoryInstance = new ArrayRepository(currentArrayList);
        }
        return arrayRepositoryInstance;
    }

    public List<CurrentArray> query(Specification specification) throws ArrayException {
        List<CurrentArray> resArrays = new ArrayList<>();
        for (CurrentArray array : list) {
            if (specification.specify(array)) {
                resArrays.add(array);
            }
        }
        return resArrays;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Repository{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
