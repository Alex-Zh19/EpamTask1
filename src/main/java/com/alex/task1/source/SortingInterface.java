package com.alex.task1.source;

import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;

public interface SortingInterface {
    void bubbleSort(ArrayEntity arrayEntity) throws ArrayEntityException;

    void insertionSort(ArrayEntity arrayEntity) throws ArrayEntityException;

    void selectionSort(ArrayEntity arrayEntity) throws ArrayEntityException;

    void sortStream(ArrayEntity arrayEntity) throws ArrayEntityException;
}
