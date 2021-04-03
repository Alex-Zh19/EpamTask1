package com.alex.task1.main;

import com.alex.task1.creator.EntityCreator;
import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;
import com.alex.task1.parser.CustomParser;
import com.alex.task1.reader.CustomReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.net.URL;

public class ArrayMain {
    final static Logger logger = LogManager.getLogger();
    final static String PATH_TO_FILE = "data/array.txt";

    public static void main(String[] args) throws ArrayEntityException {
        logger.log(Level.INFO, "start of main");
        if (PATH_TO_FILE != null) {
            CustomReader reader = new CustomReader();
            CustomParser parser = new CustomParser();
            EntityCreator entityCreator = new EntityCreator();

            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            URL pathToFileUrl = classLoader.getResource(PATH_TO_FILE);
            if (pathToFileUrl == null) {
                throw new ArrayEntityException("path to file is null");
            }
            File fileWithData = new File(pathToFileUrl.getFile());
            String stringFromFile = reader.readFile(fileWithData.getAbsolutePath());
            Integer[] arrayToCreateEntity = parser.parseStringToInteger(stringFromFile);
            ArrayEntity arrayEntity = entityCreator.createArrayEntity(arrayToCreateEntity);

            logger.log(Level.INFO, "ArrayEntity is :" + arrayEntity);
            logger.log(Level.INFO, "end of main");
        }
    }
}
