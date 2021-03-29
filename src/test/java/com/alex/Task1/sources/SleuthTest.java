package com.alex.Task1.sources;

import com.alex.Task1.entity.ArrayEntity;
import com.alex.Task1.sources.impl.Sleuth;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SleuthTest {
    @Test
    public void testMin() {
        //given
        Sleuth sleuth=new Sleuth();
        int []arr=new int[]{5,7,12};
        ArrayEntity array=new ArrayEntity(arr);
        int exp=5;

        //when
        int act=sleuth.min(array);

        //then
        Assert.assertEquals(exp,act);
    }

    @Test
    public void testMax() {
        //given
        Sleuth sleuth=new Sleuth();
        int []arr=new int[]{5,7,12};
        ArrayEntity array=new ArrayEntity(arr);
        int exp=12;

        //when
        int act=sleuth.max(array);

        //then
        Assert.assertEquals(exp,act);
    }

    @Test
    public void testMinStream() {
        //given
        Sleuth sleuth=new Sleuth();
        int []arr=new int[]{5,7,12};
        ArrayEntity array=new ArrayEntity(arr);
        int exp=5;

        //when
        int act=sleuth.minStream(array);

        //then
        Assert.assertEquals(exp,act);
    }

    @Test
    public void testMaxStream() {
        //given
        Sleuth sleuth=new Sleuth();
        int []arr=new int[]{5,7,12};
        ArrayEntity array=new ArrayEntity(arr);
        int exp=12;

        //when
        int act=sleuth.maxStream(array);

        //then
        Assert.assertEquals(exp,act);
    }
}