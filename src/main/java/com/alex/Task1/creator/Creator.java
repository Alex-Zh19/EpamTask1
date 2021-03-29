package com.alex.Task1.creator;

import com.alex.Task1.parser.Parser;
import com.alex.Task1.entity.ArrayEntity;
import com.alex.Task1.reader.Reader;
import com.alex.Task1.validator.Validator;

import java.util.ArrayList;
import java.util.List;


public class Creator {
    private Parser parser;
    private Validator validator;
    private Reader reader;

    public Creator(){
        parser=new Parser();
        validator=new Validator();
        reader=new Reader();
    }

    public ArrayEntity createEntity(){
        Integer[]arr=createIntArrayToCreateEntity();
        if(arr!=null){
        ArrayEntity newArrayEntity=new ArrayEntity(arr);
        return newArrayEntity;
        }
        return null;
    }

    private Integer[] createIntArrayToCreateEntity(){
        List<String>listFromFile=new ArrayList<>();
        listFromFile=reader.readFile();
        Integer[]integers;
        for (String str:listFromFile){
            if(validator.validateString(str)){
                integers=parser.parseString(str);
               return integers;
            }
        }
        return null;
    }






}
