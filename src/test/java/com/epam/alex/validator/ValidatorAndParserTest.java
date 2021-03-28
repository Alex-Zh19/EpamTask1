package com.epam.alex.validator;

import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ValidatorAndParserTest {

    @Test
    public void testValidateString() {
        //given
        Validator validator=new Validator();
        List<String> strings=new ArrayList<>();
        strings.add("1b,5,8");
        strings.add("a,1,3");
        strings.add("145,45,55");
        Integer[]arrayExpected=new Integer[]{145,45,55};
        Integer[]arrayActual;

        //when
        arrayActual= validator.validateString(strings);
        //then
        assertEquals(arrayActual,arrayExpected);

    }
}