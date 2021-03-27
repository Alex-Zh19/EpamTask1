package com.epam.alex.validator;

import com.epam.alex.sources.Changer;

import java.util.ArrayList;

public class Validator {
    public Integer[] validateString(ArrayList<String> stringArrayList){
        //трай катч чтобы эррей лист не равен нулю
        for(String string:stringArrayList) {
            char[] chars = getCharsFromString(string);
            if (isAcceptableToCreateArray(chars)) {
                ArrayList<Integer>bufferList=createDigitArray(chars);
                Integer []arrayToCreateEntity=bufferList.toArray(new Integer[bufferList.size()]);
                return arrayToCreateEntity;
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

    private ArrayList<Integer> createDigitArray(char[]chars){
        ArrayList<Integer>integerArrayList=new ArrayList<>();
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
