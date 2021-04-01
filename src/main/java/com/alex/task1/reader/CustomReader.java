package com.alex.task1.reader;

import com.alex.task1.exception.ArrayEntityException;
import com.alex.task1.validator.CustomValidator;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class CustomReader {

    public String readFile(String fileNameAndPreviousPackage) throws ArrayEntityException {
        String validString;
        File file;
        try {
            file = new File(getClass().getResource(fileNameAndPreviousPackage).getFile());
        } catch (NullPointerException e) {
            throw new ArrayEntityException(e);
        }
        String path = file.getAbsolutePath();
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            validString = stream.filter(i -> CustomValidator.validateString(i)).findFirst().orElse(null);
        } catch (IOException exception) {
            throw new ArrayEntityException(exception);
        }
        return validString;
    }

}

