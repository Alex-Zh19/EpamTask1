package com.alex.task1.source.impl;

import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;

import java.util.stream.IntStream;

public class Sorting implements com.alex.task1.source.SortingInterface {

    public void bubbleSort(ArrayEntity arrayEntity) throws ArrayEntityException {
        if (arrayEntity == null) {
            throw new ArrayEntityException("Array cannot be null :" + arrayEntity.toString());
        }
        if (arrayEntity.getSize() <= 1) {
            throw new ArrayEntityException("Array is already sorted or empty :" + arrayEntity.toString());
        }
        int[] array = arrayEntity.getArray();
        bubbleSortLogic(array);
        arrayEntity.setArray(array);

    }


    public void insertionSort(ArrayEntity arrayEntity) throws ArrayEntityException {
        if (arrayEntity == null) {
            throw new ArrayEntityException("Array cannot be null :" + arrayEntity.toString());
        }
        if (arrayEntity.getSize() <= 1) {
            throw new ArrayEntityException("Array is already sorted or empty :" + arrayEntity.toString());
        }
        int[] array = arrayEntity.getArray();
        insertionSortLogic(array);
        arrayEntity.setArray(array);

    }

    public void selectionSort(ArrayEntity arrayEntity) throws ArrayEntityException {
        if (arrayEntity == null) {
            throw new ArrayEntityException("Array cannot be null :" + arrayEntity.toString());
        }
        if (arrayEntity.getSize() <= 1) {
            throw new ArrayEntityException("Array is already sorted or empty :" + arrayEntity.toString());
        }
        int[] array = arrayEntity.getArray();
        selectionSortLogic(array);
        arrayEntity.setArray(array);

    }


    public void sortStream(ArrayEntity arrayEntity) throws ArrayEntityException {
        if (arrayEntity == null) {
            throw new ArrayEntityException("Array cannot be null :" + arrayEntity.toString());
        }
        if (arrayEntity.getSize() <= 1) {
            throw new ArrayEntityException("Array is already sorted or empty :" + arrayEntity.toString());
        }
        if (arrayEntity.getSize() > 1) {
            int[] arr = arrayEntity.getArray();
            arr = IntStream.of(arr).sorted().toArray();
            arrayEntity.setArray(arr);
        }
    }


    private void bubbleSortLogic(int[] array) {
        if (array.length > 1) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j - 1] > array[j]) {
                        int tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }
    }


    private void insertionSortLogic(int arr[]) {
        int n = arr.length;
        if (n > 1) {
            int i, key, j;
            for (i = 1; i < n; i++) {
                key = arr[i];
                j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
    }

    private void selectionSortLogic(int[] array) {
        if (array.length > 1) {
            for (int i = 0; i < array.length; i++) {
                int pos = i;
                int min = array[i];

                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < min) {
                        pos = j;
                        min = array[j];
                    }
                }
                array[pos] = array[i];
                array[i] = min;
            }
        }
    }


}
