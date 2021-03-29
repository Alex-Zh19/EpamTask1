package com.alex.Task1.sources;

import com.alex.Task1.entity.ArrayEntity;
import com.alex.Task1.sources.impl.Sorting;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortingTest {

    @Test
    public void testBubbleSort() {
        //given
        Sorting sorting=new Sorting();
        int arr[]=new int[]{4,5,2,6,1,6};
        ArrayEntity entityActual=new ArrayEntity(arr);

        int arr2[]=new int[]{1,2,4,5,6,6};
        ArrayEntity entityExpected=new ArrayEntity(arr2);
        //when
        sorting.bubbleSort(entityActual);
        //then
        assertEquals(entityActual,entityExpected);
    }

    @Test
    public void testInsertionSort() {
        //given
        Sorting sorting=new Sorting();
        int arr[]=new int[]{4,5,2,6,1,7};
        ArrayEntity entityActual=new ArrayEntity(arr);

        int arr2[]=new int[]{1,2,4,5,6,7};
        ArrayEntity entityExpected=new ArrayEntity(arr2);
        //when
        sorting.insertionSort(entityActual);
        //then
        assertEquals(entityActual,entityExpected);
    }

    @Test
    public void testSelectionSort() {
        //given
        Sorting sorting=new Sorting();
        int arr[]=new int[]{4,5,2,15,1,13};
        ArrayEntity entityActual=new ArrayEntity(arr);

        int arr2[]=new int[]{1,2,4,5,13,15};
        ArrayEntity entityExpected=new ArrayEntity(arr2);
        //when
        sorting.selectionSort(entityActual);
        //then
        assertEquals(entityActual,entityExpected);
    }

    @Test
    public void testSortStream(){
        //given
        Sorting sorting=new Sorting();
        int arr[]=new int[]{4,5,2,15,1,13,20,6};
        ArrayEntity entityActual=new ArrayEntity(arr);

        int arr2[]=new int[]{1,2,4,5,6,13,15,20};
        ArrayEntity entityExpected=new ArrayEntity(arr2);
        //when
        sorting.sortStream(entityActual);
        //then
        assertEquals(entityActual,entityExpected);
    }
}