package com.epam.alex.sources;

import com.epam.alex.entity.MyArray;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DefinerTest {
    @Test
    public void testAverage() {
        //given
        Definer definer=new Definer();
        int []arr=new int[]{5,7,12,-6};
        MyArray array=new MyArray(arr);
        double exp=4.5;
        //when
        double act=definer.average(array);
        //then
        assertEquals(exp,act);
    }

    @Test
    public void testSum() {
        //given
        Definer definer=new Definer();
        int []arr=new int[]{5,7,12,-6};
        MyArray array=new MyArray(arr);
        int exp=18;

        //when
        int act=definer.sum(array);

        //then
        assertEquals(exp,act);
    }

    @Test
    public void testCountOfPositive() {
        //given
        Definer definer=new Definer();
        int []arr=new int[]{5,7,12,-6,-1,0};
        MyArray array=new MyArray(arr);
        int exp=3;

        //when
        int act=definer.countOfPositive(array);

        //then
        assertEquals(exp,act);
    }

    @Test
    public void testCountOfNegative() {
        //given
        Definer definer=new Definer();
        int []arr=new int[]{5,7,12,-6,-1,0};
        MyArray array=new MyArray(arr);
        int exp=2;
        //when
        int act= definer.countOfNegative(array);

        //then
        assertEquals(exp,act);
    }
}