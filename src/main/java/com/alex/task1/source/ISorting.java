package com.alex.task1.source;

import com.alex.task1.entity.ArrayEntity;

public interface ISorting {
    void bubbleSort(ArrayEntity arrayEntity);
    void insertionSort(ArrayEntity arrayEntity);
    void selectionSort(ArrayEntity arrayEntity);
    void sortStream(ArrayEntity arrayEntity);
}
