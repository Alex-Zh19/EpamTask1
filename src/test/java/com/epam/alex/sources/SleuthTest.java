package com.epam.alex.sources;

import com.epam.alex.entity.MyArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SleuthTest {
    @Test
    public void testMin() {
        //given
        Sleuth sleuth=new Sleuth();
        int []arr=new int[]{5,7,12};
        MyArray array=new MyArray(arr);
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
        MyArray array=new MyArray(arr);
        int exp=12;

        //when
        int act=sleuth.max(array);

        //then
        Assert.assertEquals(exp,act);
    }
}