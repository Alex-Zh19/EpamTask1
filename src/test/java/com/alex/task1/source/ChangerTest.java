package com.alex.task1.source;

import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.source.impl.Changer;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ChangerTest {
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
        assertEquals(array,expArrayEntity);
    }

    @Test
    public void testChangeElementsStream() {
        //given
        Changer changer=new Changer();
        int []arr=new int[]{5,7,12,7,-1,-2,1,-1,5,7,7,8,5,7};
        ArrayEntity arrayActual=new ArrayEntity(arr);

        int []arr2=new int[]{5,0,12,0,-1,-2,1,-1,5,0,0,8,5,0};
        ArrayEntity expArrayEntity=new ArrayEntity(arr2);
        //when
        changer.changeElementsStream(arrayActual,7,0);
        //then
        assertEquals(arrayActual,expArrayEntity);
    }
}