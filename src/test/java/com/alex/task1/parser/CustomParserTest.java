package com.alex.task1.parser;

import com.alex.task1.exception.ArrayEntityException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomParserTest {

    @Test
    public void testParseString() throws ArrayEntityException{
        String digitsToCreateEntity = "14,35,6";
        int arrExpected[] = {14, 35, 6};
        CustomParser customParser = new CustomParser();
        //when

        Integer arrActual[] = customParser.parseStringToInteger(digitsToCreateEntity);

        //then
        assertEquals(arrActual, arrExpected);
    }
}