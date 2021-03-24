package com.epam.alex.sources;

import com.epam.alex.sources.Sleuth;
import com.epam.alex.entity.MyArray;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class LogicTest extends TestCase {
    static final Logger logger= LogManager.getLogger();

   @Test
    public void testMin() {
       //given
        Sleuth sleuth=new Sleuth();
        int []arr=new int[]{5,7,12};
        MyArray array=new MyArray(arr);
        logger.log(Level.INFO,"array "+array);
        //when
        int exp=5;
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
        logger.log(Level.INFO,"array "+array);
        //when
        int exp=12;
        int act=sleuth.max(array);
        //then
        Assert.assertEquals(exp,act);
    }
}