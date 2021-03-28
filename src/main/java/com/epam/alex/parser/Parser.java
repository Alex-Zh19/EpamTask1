package com.epam.alex.parser;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    public Integer[]getDigitArray(char[]chars){
        if(chars.length>0){
          List<Integer> bufferList = createDigitArrayList(chars);
          Integer[] arrayToCreateEntity = bufferList.toArray(new Integer[bufferList.size()]);
          return arrayToCreateEntity;
        }
        return null;
    }


    private List<Integer> createDigitArrayList(char[]chars){
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
