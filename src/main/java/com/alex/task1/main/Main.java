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
/*/data/a*/
    public static void main(String[] args) throws ArrayEntityException {
        CustomReader reader = new CustomReader();
        CustomParser parser = new CustomParser();
        EntityCreator entityCreator = new EntityCreator();
        String path = "rray.txt";

        String stringFromFile = reader.readFile(path);
        Integer[] arrayToCreateEntity = parser.parseStringToInteger(stringFromFile);
        ArrayEntity arrayEntity = entityCreator.createArrayEntity(arrayToCreateEntity);

        logger.log(Level.INFO, arrayEntity);
    }
}
