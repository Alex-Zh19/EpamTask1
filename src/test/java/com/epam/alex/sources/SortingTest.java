package com.epam.alex.sources;

import com.epam.alex.entity.ArrayEntity;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortingTest {

    static Logger logger= LogManager.getLogger();
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

        logger.log(Level.INFO,entityActual);
        logger.log(Level.INFO,entityExpected);
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

        logger.log(Level.INFO,entityActual);
        logger.log(Level.INFO,entityExpected);
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

        logger.log(Level.INFO,entityActual);
        logger.log(Level.INFO,entityExpected);
        //then
        assertEquals(entityActual,entityExpected);
    }
}