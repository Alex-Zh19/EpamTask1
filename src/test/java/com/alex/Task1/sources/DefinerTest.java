package com.alex.Task1.sources;

import com.alex.Task1.entity.ArrayEntity;
import com.alex.Task1.sources.impl.Definer;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DefinerTest {
    @Test
    public void testAverage() {
        //given
        Definer definer=new Definer();
        int []arr=new int[]{5,7,12,-6};
        ArrayEntity array=new ArrayEntity(arr);
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
        ArrayEntity array=new ArrayEntity(arr);
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
        ArrayEntity array=new ArrayEntity(arr);
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
        ArrayEntity array=new ArrayEntity(arr);
        int exp=2;
        //when
        int act= definer.countOfNegative(array);

        //then
        assertEquals(exp,act);
    }

    @Test
    public void testAverageStream() {
        //given
        Definer definer=new Definer();
        int []arr=new int[]{5,7,12,-6};
        ArrayEntity array=new ArrayEntity(arr);
        double exp=4.5;
        //when
        double act=definer.averageStream(array);
        //then
        assertEquals(exp,act);
    }

    @Test
    public void testSumStream() {
        //given
        Definer definer=new Definer();
        int []arr=new int[]{5,7,12,-6};
        ArrayEntity array=new ArrayEntity(arr);
        int exp=18;

        //when
        int act=definer.sumStream(array);

        //then
        assertEquals(exp,act);
    }

    @Test
    public void testCountOfPositiveStream() {
        //given
        Definer definer=new Definer();
        int []arr=new int[]{5,7,12,-6,-1,0};
        ArrayEntity array=new ArrayEntity(arr);
        int exp=3;

        //when
        int act=definer.countOfPositiveStream(array);

        //then
        assertEquals(exp,act);
    }

    @Test
    public void testCountOfNegativeStream() {
        Definer definer=new Definer();
        int []arr=new int[]{5,7,12,-6,-1,0};
        ArrayEntity array=new ArrayEntity(arr);
        int exp=2;
        //when
        int act= definer.countOfNegativeStream(array);

        //then
        assertEquals(exp,act);
    }
}