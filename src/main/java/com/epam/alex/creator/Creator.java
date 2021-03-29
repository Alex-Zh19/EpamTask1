package com.epam.alex.creator;

import com.epam.alex.entity.ArrayEntity;
import com.epam.alex.parser.Parser;
import com.epam.alex.reader.Reader;
import com.epam.alex.validator.Validator;

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
