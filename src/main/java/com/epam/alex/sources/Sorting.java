package com.epam.alex.sources;

import com.epam.alex.entity.ArrayEntity;

public class Sorting {

    public void bubbleSort(ArrayEntity arrayEntity){
            int []array= arrayEntity.getArray();
            bubbleSortLogic(array);
            arrayEntity.setArray(array);
    }

    private void bubbleSortLogic(int []array){
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

    public void insertionSort(ArrayEntity arrayEntity){
        int []array= arrayEntity.getArray();
        insertionSortLogic(array);
        arrayEntity.setArray(array);
    }

    private void insertionSortLogic(int arr[])
    {
        int n= arr.length;
        int i, key, j;
        for (i = 1; i < n; i++)
        {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void selectionSort(ArrayEntity arrayEntity){
        int []array= arrayEntity.getArray();
        selectionSortLogic(array);
        arrayEntity.setArray(array);
    }


    private void selectionSortLogic(int []array){
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
    }
}
