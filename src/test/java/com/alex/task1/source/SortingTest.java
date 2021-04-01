package com.alex.task1.source;

import com.alex.task1.creator.EntityCreator;
import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;
import com.alex.task1.source.impl.Sorting;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortingTest {

    @Test
    public void testBubbleSort() throws ArrayEntityException {
        //given
        Sorting sorting = new Sorting();
        int arr[] = new int[]{4, 5, 2, 6, 1, 6};
        EntityCreator entityCreator = new EntityCreator();
        ArrayEntity entityActual = entityCreator.createArrayEntity(arr);

        int arr2[] = new int[]{1, 2, 4, 5, 6, 6};
        ArrayEntity entityExpected = entityCreator.createArrayEntity(arr2);
        //when
        try {
            sorting.bubbleSort(entityActual);
        } catch (ArrayEntityException e) {

        }
        //then
        assertEquals(entityActual, entityExpected);
    }

    @Test
    public void testInsertionSort() throws ArrayEntityException {
        //given
        Sorting sorting = new Sorting();
        int arr[] = new int[]{4, 5, 2, 6, 1, 7};
        EntityCreator entityCreator = new EntityCreator();
        ArrayEntity entityActual = entityCreator.createArrayEntity(arr);

        int arr2[] = new int[]{1, 2, 4, 5, 6, 7};
        ArrayEntity entityExpected = entityCreator.createArrayEntity(arr2);
        //when
        try {
            sorting.insertionSort(entityActual);
        } catch (ArrayEntityException e) {

        }
        //then
        assertEquals(entityActual, entityExpected);
    }

    @Test
    public void testSelectionSort() throws ArrayEntityException {
        //given
        Sorting sorting = new Sorting();
        int arr[] = new int[]{4, 5, 2, 15, 1, 13};
        EntityCreator entityCreator = new EntityCreator();
        ArrayEntity entityActual = entityCreator.createArrayEntity(arr);

        int arr2[] = new int[]{1, 2, 4, 5, 13, 15};
        ArrayEntity entityExpected = entityCreator.createArrayEntity(arr2);
        //when
        try {
            sorting.selectionSort(entityActual);
        } catch (ArrayEntityException e) {

        }
        //then
        assertEquals(entityActual, entityExpected);
    }

    @Test
    public void testSortStream() throws ArrayEntityException {
        //given
        Sorting sorting = new Sorting();
        int arr[] = new int[]{4, 5, 2, 15, 1, 13, 20, 6};
        EntityCreator entityCreator = new EntityCreator();
        ArrayEntity entityActual = entityCreator.createArrayEntity(arr);

        int arr2[] = new int[]{1, 2, 4, 5, 6, 13, 15, 20};
        ArrayEntity entityExpected = entityCreator.createArrayEntity(arr2);
        //when
        try {
            sorting.sortStream(entityActual);
        } catch (ArrayEntityException e) {

        }
        //then
        assertEquals(entityActual, entityExpected);
    }
}