package com.alex.task1.main;

import com.alex.task1.creator.EntityCreator;
import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;
import com.alex.task1.parser.CustomParser;
import com.alex.task1.reader.CustomReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    final static Logger logger = LogManager.getLogger();
    public static void main(String[] args) throws ArrayEntityException {
        logger.log(Level.INFO, "start of main");
        CustomReader reader = new CustomReader();
        CustomParser parser = new CustomParser();
        EntityCreator entityCreator = new EntityCreator();
        String fileName = "/data/array.txt.txt";

        String stringFromFile = reader.readFile(fileName);
        Integer[] arrayToCreateEntity = parser.parseStringToInteger(stringFromFile);
        ArrayEntity arrayEntity = entityCreator.createArrayEntity(arrayToCreateEntity);

        logger.log(Level.INFO, arrayEntity);
        logger.log(Level.INFO, "end of main");
    }
}
