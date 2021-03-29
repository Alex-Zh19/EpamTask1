package com.alex.Task1.sources;

import com.alex.Task1.entity.ArrayEntity;

public interface ISorting {
    void bubbleSort(ArrayEntity arrayEntity);
    void insertionSort(ArrayEntity arrayEntity);
    void selectionSort(ArrayEntity arrayEntity);
    void sortStream(ArrayEntity arrayEntity);
}
