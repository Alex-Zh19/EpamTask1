package com.epam.alex.parser;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    public Integer[]getDigitArray(String[]digits){
          List<Integer> bufferList = createDigitArrayList(digits);
          Integer[] arrayToCreateEntity = bufferList.toArray(new Integer[bufferList.size()]);
          return arrayToCreateEntity;
    }


    private List<Integer> createDigitArrayList(String[]strings){
          List<Integer>integerArrayList= new ArrayList<>();
          for (String str:strings){
              Integer integerFromChar=Integer.parseInt(str);
              integerArrayList.add(integerFromChar);
          }
          return integerArrayList;
    }
}
