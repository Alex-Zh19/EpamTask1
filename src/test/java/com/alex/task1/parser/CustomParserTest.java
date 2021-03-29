package com.alex.task1.parser;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomParserTest {

    @Test
    public void testParseString() {
        String digitsToCreateEntity = "14,35,6";
        int arrExpected[] = {14, 35, 6};
        CustomParser customParser = new CustomParser();
        //when
        Integer arrActual[] = customParser.parseStringToInteger(digitsToCreateEntity);
        //then
        assertEquals(arrActual, arrExpected);
    }
}