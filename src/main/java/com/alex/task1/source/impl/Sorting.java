package com.alex.task1.source.impl;

import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.source.ISorting;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class Sorting implements ISorting {
    final String NULLARRAYEXCEPTION="array isn't exist";
    final String SORTEDARRAYEXCEPTION="this array already have been sorted";
    static Logger logger= LogManager.getLogger();
    public void bubbleSort(ArrayEntity arrayEntity){
        if(arrayEntity!=null){
            int []array= arrayEntity.getArray();
            bubbleSortLogic(array);
            arrayEntity.setArray(array);
        }else{
            logger.log(Level.ERROR,NULLARRAYEXCEPTION);
        }
    }

    private void bubbleSortLogic(int []array){
        if(array.length>1){
         for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
         }
        }else{
            logger.log(Level.ERROR,SORTEDARRAYEXCEPTION);
        }
    }

    public void insertionSort(ArrayEntity arrayEntity){
       if(arrayEntity!=null){
        int []array= arrayEntity.getArray();
        insertionSortLogic(array);
        arrayEntity.setArray(array);
       }else{
           logger.log(Level.ERROR,NULLARRAYEXCEPTION);
       }
    }

    private void insertionSortLogic(int arr[]) {
        int n= arr.length;
        if(n>1){
          int i, key, j;
          for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
          }
        }else{
            logger.log(Level.ERROR,SORTEDARRAYEXCEPTION);
        }
    }

    public void selectionSort(ArrayEntity arrayEntity){
        if(arrayEntity!=null){
          int []array= arrayEntity.getArray();
          selectionSortLogic(array);
          arrayEntity.setArray(array);
        }else{
            logger.log(Level.ERROR,NULLARRAYEXCEPTION);
        }
    }


    private void selectionSortLogic(int []array){
       if(array.length>1){
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
       }else{
           logger.log(Level.ERROR,SORTEDARRAYEXCEPTION);
       }
    }


    public void sortStream(ArrayEntity arrayEntity){
        if(arrayEntity!=null&&arrayEntity.getSize()>1){
            int []arr= arrayEntity.getArray();
            arr= IntStream.of(arr).sorted().toArray();
            arrayEntity.setArray(arr);
        }else{
            logger.log(Level.ERROR,NULLARRAYEXCEPTION);
        }
    }
}
