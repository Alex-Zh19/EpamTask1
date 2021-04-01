package com.alex.task1.parser;

import com.alex.task1.exception.ArrayEntityException;

import java.util.ArrayList;
import java.util.List;

public class CustomParser {

    final static String REG_EXP_TO_SPLIT_STRING = "[\\,\\s]+";

    public Integer[] parseStringToInteger(String string) throws ArrayEntityException {
        if(string.isEmpty()){
            throw new ArrayEntityException("Empty string cannot be parsed to Integer :"+string);
        }
        String[] digitsInString = string.split(REG_EXP_TO_SPLIT_STRING);
        List<Integer> intListFromString = new ArrayList<>();
        try {
            for (String digit : digitsInString) {
                intListFromString.add(stringToDigit(digit));
            }
        } catch (ArrayEntityException e) {
            throw new ArrayEntityException(e,"invalid string :"+string);
        }
        Integer[] arrayFromString = intListFromString.toArray(new Integer[intListFromString.size()]);
        return arrayFromString;
    }


    private Integer stringToDigit(String str) throws ArrayEntityException {
        try {
            Integer integer = Integer.parseInt(str);
            return integer;
        } catch (NumberFormatException e) {
            throw new ArrayEntityException(e);
        }
    }

}
