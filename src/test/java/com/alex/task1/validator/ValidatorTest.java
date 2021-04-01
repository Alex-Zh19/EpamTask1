package com.alex.task1.validator;

import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class ValidatorTest {

    @Test
    public void testTestValidateStringTrue() {
        //given
        String str3 = "145,45,55";

        //when
        boolean bool = CustomValidator.validateString(str3);

        //then
        assertTrue(bool);
    }

    @Test
    public void testTestValidateStringStrFalse() {
        //given
        String str1 = "1b,5,8";

        //when
        boolean bool = CustomValidator.validateString(str1);

        //then
        assertFalse(bool);
    }
}