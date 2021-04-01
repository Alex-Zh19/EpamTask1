package com.alex.task1.reader;

import com.alex.task1.exception.ArrayEntityException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomReaderTest {

    @Test
    public void testReadFile() {
        //given
        String fileName = "/data/array.txt";
        String stringActual = "";
        String stringsExpected = "14,45,55";
        CustomReader customReader = new CustomReader();

        //when

        try {
            stringActual = customReader.readFile(fileName);
        } catch (ArrayEntityException exception) {

        }
        //then

        assertEquals(stringActual, stringsExpected);

    }

}