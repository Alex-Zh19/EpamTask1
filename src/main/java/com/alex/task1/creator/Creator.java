package com.alex.task1.creator;

import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;


public class Creator {

    public ArrayEntity createArrayEntity(Integer[] arrayToCreateEntity)throws ArrayEntityException  {
        if(arrayToCreateEntity==null){
            throw new ArrayEntityException("Array cannot be null");
        }
        ArrayEntity newArrayEntity = new ArrayEntity(arrayToCreateEntity.length);
        newArrayEntity.setArray(arrayToCreateEntity);
        return newArrayEntity;
    }

    public ArrayEntity createArrayEntity(int[] arrayToCreateEntity) {
        ArrayEntity newArrayEntity = new ArrayEntity(arrayToCreateEntity.length);
        newArrayEntity.setArray(arrayToCreateEntity);
        return newArrayEntity;
    }

    public ArrayEntity createArrayEntity(int size) throws ArrayEntityException {
        if (size < 0) {
            throw new ArrayEntityException("Size cannot be less than 0");
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
