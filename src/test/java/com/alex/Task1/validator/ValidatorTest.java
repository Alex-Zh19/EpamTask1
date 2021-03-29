package com.alex.Task1.validator;

import org.testng.annotations.Test;



import static org.testng.Assert.*;

public class ValidatorTest {

    @Test
    public void testTestValidateStringTrue() {
        //given
        String str3="145,45,55";
        Validator validator=new Validator();
        //when
        boolean bool=validator.validateString(str3);

        //then
        assertTrue(bool);
    }
    @Test
    public void testTestValidateStringStrFalse() {
        //given
        String str1="1b,5,8";

        Validator validator=new Validator();
        //when
        boolean bool=validator.validateString(str1);

        //then
        assertFalse(bool);
    }
}