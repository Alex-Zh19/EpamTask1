package com.epam.alex.validator;

import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ValidatorTest {

    @Test
    public void testValidateString() {
        //given
        Validator validator=new Validator();
        List<String> strings=new ArrayList<>();
        strings.add("1b,5,8");
        strings.add("a,1,3");
        strings.add("145,45,55");
        String[]stringExpected={"145","45","55"};
        String []stringActual;

        //when
        stringActual= validator.validateString(strings);
        //then
        assertEquals(stringActual,stringExpected);

    }
}