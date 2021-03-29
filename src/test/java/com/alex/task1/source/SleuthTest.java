package com.alex.task1.source;

import com.alex.task1.creator.Creator;
import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;
import com.alex.task1.source.impl.Sleuth;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SleuthTest {
    @Test
    public void testMin() {
        //given
        Sleuth sleuth = new Sleuth();
        int[] arr = new int[]{5, 7, 12};
        Creator creator = new Creator();

        ArrayEntity array = creator.createArrayEntity(arr);
        int expected = 5;

        //when

        int actual = sleuth.min(array);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMax() {
        //given
        Sleuth sleuth = new Sleuth();
        int[] arr = new int[]{5, 7, 12};
        Creator creator = new Creator();
        ArrayEntity array = creator.createArrayEntity(arr);
        int expected = 12;

        //when
        int actual = sleuth.max(array);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMinStream() {
        //given
        Sleuth sleuth = new Sleuth();
        int[] arr = new int[]{5, 7, 12};
        Creator creator = new Creator();
        ArrayEntity array = creator.createArrayEntity(arr);
        int expected = 5;

        //when
        int actual = 0;
        try {
            actual = sleuth.minStream(array);
        } catch (ArrayEntityException e) {

        }
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMaxStream() {
        //given
        Sleuth sleuth = new Sleuth();
        int[] arr = new int[]{5, 7, 12};
        Creator creator = new Creator();
        ArrayEntity array = creator.createArrayEntity(arr);
        int expected = 12;

        //when
        int actual = 0;
        try {
            actual = sleuth.maxStream(array);
        } catch (ArrayEntityException e) {

        }
        //then
        Assert.assertEquals(expected, actual);
    }
}