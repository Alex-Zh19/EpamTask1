package com.alex.task1.source.impl;

import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;

import java.util.stream.IntStream;

public class Changer implements com.alex.task1.source.ChangerInterface {

    public void changeElements(ArrayEntity arrayEntity, int replace, int by) throws ArrayEntityException {
        if (arrayEntity == null) {
            throw new ArrayEntityException("Array cannot be null");
        }
        int[] array = arrayEntity.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == replace) {
                array[i] = by;
            }
        }
        arrayEntity.setArray(array);

    }

    public void changeElementsStream(ArrayEntity arrayEntity, int replace, int by) throws ArrayEntityException {
        if (arrayEntity == null || arrayEntity.getSize() <= 0) {
            throw new ArrayEntityException("Array cannot be null");
        }
        int[] arr = arrayEntity.getArray();
        arr = IntStream.of(arr).map(i -> (i == replace) ? (i = by) : (i = i)).toArray();
        arrayEntity.setArray(arr);


    }
}
