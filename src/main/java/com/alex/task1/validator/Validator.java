package com.alex.task1.validator;


public class Validator {
    private static final String REGEXPTOVALIDATESTRING = "^([\\-?\\d+\\,?]+)$";

    public boolean validateString(String str) {
        return str.matches(REGEXPTOVALIDATESTRING);
    }


}
