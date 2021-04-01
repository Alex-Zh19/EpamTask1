package com.alex.task1.source.impl;

import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;


import java.util.stream.IntStream;

public class Sleuth implements com.alex.task1.source.SleuthInterface {


    public int min(ArrayEntity arrayEntity) throws ArrayEntityException {
        if (arrayEntity == null) {
            throw new ArrayEntityException("Array cannot be null :" + arrayEntity.toString());
        }
        if (arrayEntity.getSize() <= 0) {
            throw new ArrayEntityException("Array is empty :" + arrayEntity.toString());
        }
        int min = 0;
        int[] array = arrayEntity.getArray();
        min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int minStream(ArrayEntity array) throws ArrayEntityException {
        if (array == null) {
            throw new ArrayEntityException("Array cannot be null :" + array.toString());
        }
        if (array.getSize() <= 0) {
            throw new ArrayEntityException("Array is empty :" + array.toString());
        }

        int[] arr = array.getArray();
        int min = IntStream.of(arr).min().getAsInt();
        return min;
    }

    public int max(ArrayEntity arrayEntity) throws ArrayEntityException {
        if (arrayEntity == null) {
            throw new ArrayEntityException("Array cannot be null :" + arrayEntity.toString());
        }
        if (arrayEntity.getSize() <= 0) {
            throw new ArrayEntityException("Array is empty :" + arrayEntity.toString());
        }
        int max = 0;
        int[] array = arrayEntity.getArray();
        max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public int maxStream(ArrayEntity array) throws ArrayEntityException {
        if (array == null) {
            throw new ArrayEntityException("Array cannot be null :" + array.toString());
        }
        if (array.getSize() <= 0) {
            throw new ArrayEntityException("Array is empty :" + array.toString());
        }

        int[] arr = array.getArray();
        int max = IntStream.of(arr).max().getAsInt();
        return max;
    }
}
