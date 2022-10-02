package com.epam.taskArray.repository;

import com.epam.taskArray.entity.CurrentArray;

import java.util.List;

public class Repository {
    private static Repository repositoryInstance;
    private List<CurrentArray> list;

    private Repository(List<CurrentArray> currentArrayList) {
        this.list=currentArrayList;
    }

    public Repository() {

    }

    public static Repository getInstance(List<CurrentArray> currentArrayList) {
        if (repositoryInstance == null) {
            repositoryInstance = new Repository(currentArrayList);
        }
        return repositoryInstance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Repository{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
