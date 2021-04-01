package com.alex.task1.reader;

import com.alex.task1.exception.ArrayEntityException;
import com.alex.task1.validator.CustomValidator;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class CustomReader {

    public String readFile(String fileName) throws ArrayEntityException {
        if(fileName==null){
            throw new ArrayEntityException("Filepath is null :"+fileName);
        }
        File file= new File(fileName);
        if(!file.isFile()){
            throw new ArrayEntityException("file isn't exist :"+fileName);
        }
        if(!file.canRead()){
            throw new ArrayEntityException("can't read file :"+fileName);
        }
        if(file.length()==0){
            throw new ArrayEntityException("file is empty :"+fileName);
        }
        String validString;
        String path = file.getAbsolutePath();
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            validString = stream.filter(i -> CustomValidator.validateString(i)).findFirst().orElse(null);
        } catch (IOException exception) {
            throw new ArrayEntityException(exception);
        }
        if(validString==null){
            throw new ArrayEntityException("incorrect data in file");
        }
        return validString;
    }

}

