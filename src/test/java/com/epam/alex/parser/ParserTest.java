package com.epam.alex.parser;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ParserTest {

    @Test
    public void testParseString() {
        String digitsToCreateEntity="14,35,6";
        int arrExpected[]={14,35,6};
        Parser parser=new Parser();
        //when
        Integer arrActual[]= parser.parseString(digitsToCreateEntity);
        //then
        assertEquals(arrActual,arrExpected);
    }
}