package com.epam.alex.validator;


public class Validator {
    private static final String REGEXP="^([-\\d,\\d]+,)+\\d+";

    public boolean validateString(String str){
        return str.matches(REGEXP);
    }


}
