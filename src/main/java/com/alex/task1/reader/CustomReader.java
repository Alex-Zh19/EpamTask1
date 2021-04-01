package com.alex.task1.reader;

import com.alex.task1.exception.ArrayEntityException;
import com.alex.task1.validator.CustomValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class CustomReader {

    final static Logger logger=LogManager.getLogger();
    public String readFile(String fileName) throws ArrayEntityException {
        if(fileName==null){
            logger.log(Level.ERROR,"Filepath is null :"+fileName);
            throw new ArrayEntityException("Filepath is null :"+fileName);
        }
        File file= new File(fileName);
        if(!file.isFile()){
            logger.log(Level.ERROR,"file isn't exist :"+fileName);
            throw new ArrayEntityException("file isn't exist :"+fileName);
        }
        if(!file.canRead()){
            logger.log(Level.ERROR,"can't read file :"+fileName);
            throw new ArrayEntityException("can't read file :"+fileName);
        }
        if(file.length()==0){
            logger.log(Level.ERROR,"file is empty :"+fileName);
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
            logger.log(Level.ERROR,"incorrect data in file :"+fileName);
            throw new ArrayEntityException("incorrect data in file :"+fileName);
        }
        return validString;
    }

}

