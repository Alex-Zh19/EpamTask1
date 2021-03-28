package com.epam.alex.validator;

import java.util.ArrayList;
import java.util.List;

public class Validator {
    public Integer[] validateString(List<String> stringArrayList){
       if(!stringArrayList.isEmpty()) {
           for (String string : stringArrayList) {
               char[] chars = getCharsFromString(string);
               if (isAcceptableToCreateArray(chars)) {
                   List<Integer> bufferList = createDigitArray(chars);
                   Integer[] arrayToCreateEntity = bufferList.toArray(new Integer[bufferList.size()]);
                   return arrayToCreateEntity;
               }
           }
       }

       return null;
    }

    private char[]getCharsFromString(String str){
        int length=str.length();
        char[]strToCharArr=new char[length];
        str.getChars(0,length,strToCharArr,0 );
        return strToCharArr;
    }

    private boolean isAcceptableToCreateArray(char[]charsFromString){
        for (char ch:charsFromString){
           if(ch==','){
               continue;
           }
           if(!isDigit(ch)){
               return false;
           }
        }
        return true;
    }

    private boolean isDigit(char c){
        return Character.isDigit(c);
    }

    private List<Integer> createDigitArray(char[]chars){
        List<Integer>integerArrayList= new ArrayList<>();
        for (Character ch:chars){
            if(ch==','){
                continue;
            }
            Integer integerFromChar=Integer.parseInt(ch.toString());
            integerArrayList.add(integerFromChar);
        }
        return integerArrayList;
    }
}
