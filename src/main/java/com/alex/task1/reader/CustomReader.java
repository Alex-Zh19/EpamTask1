package com.alex.task1.reader;

import com.alex.task1.exception.ArrayEntityException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CustomReader {

    public List<String> readFile(String fileName) throws ArrayEntityException {
        List<String> allStrings = new ArrayList<>();

        String path=fileName;
        try(Stream<String>stream=Files.lines(Paths.get(path))){
            allStrings=stream.filter(i->!i.isEmpty()).collect(Collectors.toList());
        }catch (IOException exception){
            throw new ArrayEntityException(exception);
        }
        return allStrings;
    }

}

