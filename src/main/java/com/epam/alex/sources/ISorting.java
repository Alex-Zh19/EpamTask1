package com.epam.alex.sources;

import com.epam.alex.entity.ArrayEntity;

public interface ISorting {
    void bubbleSort(ArrayEntity arrayEntity);
    void insertionSort(ArrayEntity arrayEntity);
    void selectionSort(ArrayEntity arrayEntity);
    void sortStream(ArrayEntity arrayEntity);
}
