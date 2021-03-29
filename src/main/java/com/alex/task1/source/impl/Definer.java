package com.alex.task1.source.impl;

import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;

import java.util.stream.IntStream;

public class Definer implements com.alex.task1.source.DefinerInterface {

    public double average(ArrayEntity arrayEntity) throws ArrayEntityException {
        if (arrayEntity == null) {
            throw new ArrayEntityException("Array cannot be null");
        }
        int[] array = arrayEntity.getArray();
        double result = 0.0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        result = result / (array.length);
        return result;


    }

    public double averageStream(ArrayEntity arrayEntity) throws ArrayEntityException {
        if (arrayEntity == null || arrayEntity.getSize() <= 0) {
            throw new ArrayEntityException("Array cannot be null");
        }

        double result;
        int[] arr = arrayEntity.getArray();
        result = IntStream.of(arr).average().getAsDouble();
        return result;


    }

    public int sum(ArrayEntity arrayEntity) throws ArrayEntityException {
        if (arrayEntity == null) {
            throw new ArrayEntityException("Array cannot be null");
        }
        int[] array = arrayEntity.getArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;


    }

    public int sumStream(ArrayEntity arrayEntity) throws ArrayEntityException {
        if (arrayEntity == null || arrayEntity.getSize() <= 0) {
            throw new ArrayEntityException("Array cannot be null");
        }
        int sum;
        int[] arr = arrayEntity.getArray();
        sum = IntStream.of(arr).sum();
        return sum;


    }

    public int countOfPositive(ArrayEntity arrayEntity) throws ArrayEntityException {
        if (arrayEntity == null) {
            throw new ArrayEntityException("Array cannot be null");
        }
        int[] array = arrayEntity.getArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;


    }

    public int countOfPositiveStream(ArrayEntity arrayEntity) throws ArrayEntityException {
        if (arrayEntity == null) {
            throw new ArrayEntityException("Array cannot be null");
        }
        int count;
        int[] arr = arrayEntity.getArray();
        count = (int) IntStream.of(arr).filter(i -> i > 0).count();
        return count;


    }

    public int countOfNegative(ArrayEntity arrayEntity) throws ArrayEntityException {
        if (arrayEntity == null) {
            throw new ArrayEntityException("Array cannot be null");
        }
        int[] array = arrayEntity.getArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;


    }

    public int countOfNegativeStream(ArrayEntity arrayEntity) throws ArrayEntityException {
        if (arrayEntity == null) {
            throw new ArrayEntityException("Array cannot be null");
        }
        int count;
        int[] arr = arrayEntity.getArray();
        count = (int) IntStream.of(arr).filter(i -> i < 0).count();
        return count;


    }
}
