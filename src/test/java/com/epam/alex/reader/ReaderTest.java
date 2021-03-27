package com.epam.alex.reader;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class ReaderTest {

    @Test
    public void testReadFile() {
        //given
        ArrayList<String>stringsExpected=new ArrayList<>();
        stringsExpected.add("1b,5,8");
        stringsExpected.add("a,1,3");
        stringsExpected.add("1,4,5");
        ArrayList<String>stringsActual;
        Reader reader=new Reader();
        //when
        stringsActual= reader.readFile();
        //then
        assertEquals(stringsActual,stringsExpected);
    }
}