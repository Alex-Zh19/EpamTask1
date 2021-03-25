package com.epam.alex.sources;

import com.epam.alex.entity.ArrayEntity;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ChangerTest {
    private final static Logger logger= LogManager.getLogger();

    @Test
    public void testChangeElements() {
        //given
        Changer changer=new Changer();
        int []arr=new int[]{5,7,12,7,-1,-2,1,-1,5,7,7,8,5,7};
        ArrayEntity array=new ArrayEntity(arr);

        int []arr2=new int[]{5,0,12,0,-1,-2,1,-1,5,0,0,8,5,0};
        ArrayEntity expArrayEntity=new ArrayEntity(arr2);
        //when
        changer.changeElements(array,7,0);

        //then
        logger.log(Level.INFO,array);
        assertEquals(array,expArrayEntity);
    }
}