package com.alex.task1.source;

import com.alex.task1.creator.EntityCreator;
import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;
import com.alex.task1.source.impl.Definer;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DefinerTest {
    @Test
    public void testAverage() throws ArrayEntityException {
        //given
        Definer definer = new Definer();
        int[] arr = new int[]{5, 7, 12, -6};
        EntityCreator entityCreator = new EntityCreator();
        ArrayEntity array = entityCreator.createArrayEntity(arr);
        double expected = 4.5;
        //when
        double actual = 0;
        try {
            actual = definer.average(array);
        } catch (ArrayEntityException e) {

        }
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testSum() throws ArrayEntityException {
        //given
        Definer definer = new Definer();
        int[] arr = new int[]{5, 7, 12, -6};
        EntityCreator entityCreator = new EntityCreator();
        ArrayEntity array = entityCreator.createArrayEntity(arr);
        int expected = 18;

        //when
        int actual = 0;
        try {
            actual = definer.sum(array);
        } catch (ArrayEntityException e) {

        }
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testCountOfPositive() throws ArrayEntityException {
        //given
        Definer definer = new Definer();
        int[] arr = new int[]{5, 7, 12, -6, -1, 0};
        EntityCreator entityCreator = new EntityCreator();
        ArrayEntity array = entityCreator.createArrayEntity(arr);
        int expected = 3;

        //when
        int actual = 0;
        try {
            actual = definer.countOfPositive(array);
        } catch (ArrayEntityException e) {

        }
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testCountOfNegative() throws ArrayEntityException {
        //given
        Definer definer = new Definer();
        int[] arr = new int[]{5, 7, 12, -6, -1, 0};
        EntityCreator entityCreator = new EntityCreator();
        ArrayEntity array = entityCreator.createArrayEntity(arr);
        int expected = 2;
        //when
        int actual = 0;
        try {
            actual = definer.countOfNegative(array);
        } catch (ArrayEntityException e) {

        }
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testAverageStream() throws ArrayEntityException {
        //given
        Definer definer = new Definer();
        int[] arr = new int[]{5, 7, 12, -6};
        EntityCreator entityCreator = new EntityCreator();
        ArrayEntity array = entityCreator.createArrayEntity(arr);
        double expected = 4.5;
        //when
        double actual = 0;
        try {
            actual = definer.averageStream(array);
        } catch (ArrayEntityException e) {

        }
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testSumStream() throws ArrayEntityException {
        //given
        Definer definer = new Definer();
        int[] arr = new int[]{5, 7, 12, -6};
        EntityCreator entityCreator = new EntityCreator();
        ArrayEntity array = entityCreator.createArrayEntity(arr);
        int expected = 18;

        //when
        int actual = 0;
        try {
            actual = definer.sumStream(array);
        } catch (ArrayEntityException e) {

        }
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testCountOfPositiveStream() throws ArrayEntityException {
        //given
        Definer definer = new Definer();
        int[] arr = new int[]{5, 7, 12, -6, -1, 0};
        EntityCreator entityCreator = new EntityCreator();
        ArrayEntity array = entityCreator.createArrayEntity(arr);
        int expected = 3;

        //when
        int actual = 0;
        try {
            actual = definer.countOfPositiveStream(array);
        } catch (ArrayEntityException e) {

        }
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testCountOfNegativeStream() throws ArrayEntityException {
        Definer definer = new Definer();
        int[] arr = new int[]{5, 7, 12, -6, -1, 0};
        EntityCreator entityCreator = new EntityCreator();
        ArrayEntity array = entityCreator.createArrayEntity(arr);
        int expected = 2;
        //when
        int actual = 0;
        try {
            actual = definer.countOfNegativeStream(array);
        } catch (ArrayEntityException e) {

        }
        //then
        assertEquals(expected, actual);
    }
}