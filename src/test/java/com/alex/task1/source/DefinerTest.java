package com.alex.task1.source;

import com.alex.task1.creator.Creator;
import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;
import com.alex.task1.source.impl.Definer;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DefinerTest {
    @Test
    public void testAverage() {
        //given
        Definer definer = new Definer();
        int[] arr = new int[]{5, 7, 12, -6};
        Creator creator = new Creator();
        ArrayEntity array = creator.createArrayEntity(arr);
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
    public void testSum() {
        //given
        Definer definer = new Definer();
        int[] arr = new int[]{5, 7, 12, -6};
        Creator creator = new Creator();
        ArrayEntity array = creator.createArrayEntity(arr);
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
    public void testCountOfPositive() {
        //given
        Definer definer = new Definer();
        int[] arr = new int[]{5, 7, 12, -6, -1, 0};
        Creator creator = new Creator();
        ArrayEntity array = creator.createArrayEntity(arr);
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
    public void testCountOfNegative() {
        //given
        Definer definer = new Definer();
        int[] arr = new int[]{5, 7, 12, -6, -1, 0};
        Creator creator = new Creator();
        ArrayEntity array = creator.createArrayEntity(arr);
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
    public void testAverageStream() {
        //given
        Definer definer = new Definer();
        int[] arr = new int[]{5, 7, 12, -6};
        Creator creator = new Creator();
        ArrayEntity array = creator.createArrayEntity(arr);
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
    public void testSumStream() {
        //given
        Definer definer = new Definer();
        int[] arr = new int[]{5, 7, 12, -6};
        Creator creator = new Creator();
        ArrayEntity array = creator.createArrayEntity(arr);
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
    public void testCountOfPositiveStream() {
        //given
        Definer definer = new Definer();
        int[] arr = new int[]{5, 7, 12, -6, -1, 0};
        Creator creator = new Creator();
        ArrayEntity array = creator.createArrayEntity(arr);
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
    public void testCountOfNegativeStream() {
        Definer definer = new Definer();
        int[] arr = new int[]{5, 7, 12, -6, -1, 0};
        Creator creator = new Creator();
        ArrayEntity array = creator.createArrayEntity(arr);
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