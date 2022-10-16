package com.epam.array.reader;

import com.epam.array.exception.ArrayException;

import java.util.List;

public interface AllFileReader {
    List<String> readFromFile(String pathOrFileName) throws ArrayException;
}
