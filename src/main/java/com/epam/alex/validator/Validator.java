package com.epam.alex.validator;


import com.epam.alex.parser.Parser;

import java.util.List;

public class Validator {
    public Integer[] validateString(List<String> stringArrayList){
       if(!stringArrayList.isEmpty()) {
           for (String string : stringArrayList) {
              String []substr=string.split(",");
               if (isAcceptableToCreateArray(substr)) {
                   Parser parser=new Parser();
                   return parser.getDigitArray(substr);
               }
           }
       }
       return null;
    }


    private boolean isAcceptableToCreateArray(String[]digitsFromString){
        for (String str:digitsFromString){
           if(!isDigit(str)){
               return false;
           }
        }
        return true;
    }

    private boolean isDigit(String str)throws NumberFormatException{
        try{
        Integer integer=Integer.parseInt(str);
        return true;
        }catch (NumberFormatException e){
            return false;
        }
    }


}
