package com.epam.alex.creator;

import com.epam.alex.entity.ArrayEntity;
import com.epam.alex.parser.Parser;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CreatorTest {

    @Test
    public void testCreateArrayEntity() {
        //given
        int arrToCreateExpected[]={14,35,6};
        Integer arrToCreateActual[]={14,35,6};
        Creator creator=new Creator();
        ArrayEntity arrayEntityExpected=new ArrayEntity(arrToCreateExpected);
        //when
        ArrayEntity arrayEntityActual= creator.createArrayEntity(arrToCreateActual);
        //then
        assertEquals(arrayEntityActual,arrayEntityExpected);
    }
}