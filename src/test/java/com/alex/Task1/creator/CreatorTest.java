package com.alex.Task1.creator;

import com.alex.Task1.entity.ArrayEntity;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CreatorTest {

    @Test
    public void testCreateArrayEntity() {
        //given
        int arrToCreateExpected[]={14,45,55};
        Creator creator=new Creator();
        ArrayEntity arrayEntityExpected=new ArrayEntity(arrToCreateExpected);
        //when
        ArrayEntity arrayEntityActual= creator.createEntity();
        //then
        assertEquals(arrayEntityActual,arrayEntityExpected);
    }

}