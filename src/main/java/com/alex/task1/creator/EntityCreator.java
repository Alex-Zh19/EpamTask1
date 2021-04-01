package com.alex.task1.creator;

import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class EntityCreator {
    final static Logger logger= LogManager.getLogger();
    public ArrayEntity createArrayEntity(Integer[] arrayToCreateEntity) throws ArrayEntityException {
        if (arrayToCreateEntity == null) {
            logger.log(Level.ERROR,"Array cannot be null :" + arrayToCreateEntity.toString());
            throw new ArrayEntityException("Array cannot be null :" + arrayToCreateEntity.toString());
        }
        ArrayEntity newArrayEntity = new ArrayEntity(arrayToCreateEntity.length);
        newArrayEntity.setArray(arrayToCreateEntity);
        return newArrayEntity;
    }

    public ArrayEntity createArrayEntity(int[] arrayToCreateEntity) throws ArrayEntityException {
        if (arrayToCreateEntity == null) {
            logger.log(Level.ERROR,"Array cannot be null :" + arrayToCreateEntity.toString());
            throw new ArrayEntityException("Array cannot be null :" + arrayToCreateEntity.toString());
        }
        ArrayEntity newArrayEntity = new ArrayEntity(arrayToCreateEntity.length);
        newArrayEntity.setArray(arrayToCreateEntity);
        return newArrayEntity;
    }

    public ArrayEntity createArrayEntity(int size) throws ArrayEntityException {
        if (size < 0) {
            logger.log(Level.ERROR,"Size cannot be less than 0 :" + size);
            throw new ArrayEntityException("Size cannot be less than 0 :" + size);
        }
        ArrayEntity newArrayEntity = new ArrayEntity(size);
        int[] array = new int[size];
        initArray(array);
        newArrayEntity.setArray(array);
        return newArrayEntity;
    }

    private void initArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-100 + Math.random() * 100);
        }
    }


}
