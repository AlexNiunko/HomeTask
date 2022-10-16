package com.epam.array.repository;

import com.epam.array.creator.ListCurrentArrayCreator;
import com.epam.array.entity.CurrentArray;
import com.epam.array.exception.ArrayException;
import com.epam.array.specification.Specification;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayRepository  {
    static final Logger logger = LogManager.getLogger();
    private static ArrayRepository arrayRepositoryInstance;
    private List<CurrentArray> list;

    private ArrayRepository(List<CurrentArray> currentArrayList) {
        this.list = currentArrayList;
    }

    public static ArrayRepository getInstance(String path) throws ArrayException {
        if (arrayRepositoryInstance == null) {
            ListCurrentArrayCreator listCurrentArrayCreator=new ListCurrentArrayCreator();
            List<CurrentArray> currentArrayList=new ArrayList<>(listCurrentArrayCreator.currentArrayList(path));
            arrayRepositoryInstance = new ArrayRepository(currentArrayList);
        }
        return arrayRepositoryInstance;
    }


    public void add(CurrentArray array) throws ArrayException {
        if (!(list.contains(array))) {
            list.add(array);
        } else {
            logger.log(Level.ERROR, "this element already exists");
            throw new ArrayException("this element already exists");
        }
    }


    public void update(CurrentArray oldArray, CurrentArray newArray) throws ArrayException {
        if (list.contains(oldArray)) {
            int oldArrayIndex = list.indexOf(oldArray);
            list.set(oldArrayIndex, newArray);
        } else {
            logger.log(Level.ERROR, "This array is not in the list");
            throw new ArrayException("This array is not in the list");
        }

    }


    public List<CurrentArray> getAll() {
        return list;
    }


    public boolean ifExist(Long id) {
        boolean ifExist = list.stream()
                .anyMatch(array -> array.getId().equals(id));
        return ifExist;
    }


    public CurrentArray getArray(Long id) throws ArrayException {
        CurrentArray resArray = null;
        if (!(ifExist(id))) {
            logger.log(Level.ERROR, "There is no element with this ID");
            throw new ArrayException("There is no element with this ID");
        } else {
            for (CurrentArray array : list) {
                if (array.getId().equals(id)) {
                    int index = list.indexOf(array);
                    resArray = list.get(index);
                }
            }
        }
        return resArray;
    }



    public void setID(int index, Long newID) {
        list.get(index).setId(newID);
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

    public void remove(Long id) throws ArrayException {
        if (!(ifExist(id))) {
            logger.log(Level.ERROR, "There is no element with this ID");
            throw new ArrayException("There is no element with this ID");
        } else {
            Iterator<CurrentArray> iterator = list.iterator();
            while (iterator.hasNext()) {
                Long tempId = iterator.next().getId();
                if (tempId.equals(id)) {
                    iterator.remove();
                }
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Repository{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayRepository that = (ArrayRepository) o;

        return list != null ? list.equals(that.list) : that.list == null;
    }

    @Override
    public int hashCode() {
        return list != null ? list.hashCode() : 0;
    }
}
