package com.alex.task1.reader;

import com.alex.task1.exception.ArrayEntityException;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class CustomReaderTest {

    @Test
    public void testReadFile(){
        //given
        List<String> stringsActual=new ArrayList<>();
        List<String> stringsExpected=new ArrayList<>();
        stringsExpected.add("1b,5,8");
        stringsExpected.add("a,1,3");
        stringsExpected.add("14,45,55");
        CustomReader customReader =new CustomReader();
        //when

        try {
            stringsActual = customReader.readFile();
        }catch (ArrayEntityException exception){

        }
        //then
        assertEquals(stringsActual,stringsExpected);

    }

}