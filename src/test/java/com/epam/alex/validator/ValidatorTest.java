package com.epam.alex.validator;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class ValidatorTest {

    @Test
    public void testValidateString() {
        //given
        Validator validator=new Validator();
        ArrayList<String> strings=new ArrayList<>();
        strings.add("1b,5,8");
        strings.add("a,1,3");
        strings.add("1,4,5");
        Integer[]arrayExpected=new Integer[]{1,4,5};
        Integer[]arrayActual;

        //when
        arrayActual= validator.validateString(strings);
        //then
        assertEquals(arrayActual,arrayExpected);

    }
}