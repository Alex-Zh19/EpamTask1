package com.alex.task1.parser;

import com.alex.task1.exception.ArrayEntityException;

import java.util.ArrayList;
import java.util.List;

public class CustomParser {

    final static String REG_EXP_TO_SPLIT_STRING = "[\\,\\s]+";

    public Integer[] parseStringToInteger(String string) {
        String[] digitsInString = string.split(REG_EXP_TO_SPLIT_STRING);
        List<Integer> intList = new ArrayList<>();
        try {
            for (String digit : digitsInString) {
                intList.add(stringToDigit(digit));
            }
        } catch (ArrayEntityException e) {

        }
        Integer[] arrayFromString = intList.toArray(new Integer[intList.size()]);
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
