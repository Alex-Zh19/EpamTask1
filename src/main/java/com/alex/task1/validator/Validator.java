package com.alex.task1.validator;


public class Validator {
    private static final String REG_EXP_TO_VALIDATE_STRING = "^([\\-?\\d+\\,?]+)$";

    public boolean validateString(String str) {
        return str.matches(REG_EXP_TO_VALIDATE_STRING);
    }


}
