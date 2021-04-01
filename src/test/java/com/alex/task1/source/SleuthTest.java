package com.alex.task1.source;

import com.alex.task1.creator.EntityCreator;
import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;
import com.alex.task1.source.impl.Sleuth;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SleuthTest {
    @Test
    public void testMin() throws ArrayEntityException {
        //given
        Sleuth sleuth = new Sleuth();
        int[] arr = new int[]{5, 7, 12};
        EntityCreator entityCreator = new EntityCreator();

        ArrayEntity array = entityCreator.createArrayEntity(arr);
        int expected = 5;

        //when

        int actual = sleuth.min(array);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMax() throws ArrayEntityException {
        //given
        Sleuth sleuth = new Sleuth();
        int[] arr = new int[]{5, 7, 12};
        EntityCreator entityCreator = new EntityCreator();
        ArrayEntity array = entityCreator.createArrayEntity(arr);
        int expected = 12;

        //when
        int actual = sleuth.max(array);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMinStream() throws ArrayEntityException {
        //given
        Sleuth sleuth = new Sleuth();
        int[] arr = new int[]{5, 7, 12};
        EntityCreator entityCreator = new EntityCreator();
        ArrayEntity array = entityCreator.createArrayEntity(arr);
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
    public void testMaxStream() throws ArrayEntityException {
        //given
        Sleuth sleuth = new Sleuth();
        int[] arr = new int[]{5, 7, 12};
        EntityCreator entityCreator = new EntityCreator();
        ArrayEntity array = entityCreator.createArrayEntity(arr);
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