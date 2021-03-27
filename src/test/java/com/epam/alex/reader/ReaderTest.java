package com.epam.alex.reader;

import com.epam.alex.exception.ArrayEntityException;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ReaderTest {

    @Test
    public void testReadFileException(){
        //given
        List<String> stringsActual;
        List<String> stringsExpected=new ArrayList<>();
        stringsExpected.add("1b,5,8");
        stringsExpected.add("a,1,3");
        stringsExpected.add("1,4,5");
        Reader reader=new Reader();
        //when
        stringsActual= reader.readFile();
        //then
        assertEquals(stringsActual,stringsExpected);

    }

}