package com.alex.Task1.parser;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    final static String REGEXP="[\\,\\s]+";
    public Integer[]parseString(String str){
        String[]digitsInString=str.split(REGEXP);
        List<Integer> intList=new ArrayList<>();
        for(String digit:digitsInString){
            intList.add(stringToDigit(digit));
        }
        Integer[]arrayFromString=intList.toArray(new Integer[intList.size()]);
        return arrayFromString;
    }


    private Integer stringToDigit(String str)throws NumberFormatException{
        try{
            Integer integer=Integer.parseInt(str);
            return integer;
        }catch (NumberFormatException e){
            return null;
        }
    }


}
