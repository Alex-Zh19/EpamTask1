package com.epam.alex.sources.impl;

import com.epam.alex.entity.ArrayEntity;
import com.epam.alex.sources.ISleuth;

import java.util.stream.IntStream;

public class Sleuth implements ISleuth {

    public int min(ArrayEntity array){
       if(array!=null&&array.getSize()>0){
        int min=array.getElement(0);
        for(int i=1;i<array.getSize();i++){
            if(array.getElement(i)<min){
                min=array.getElement(i);
            }
        }
        return min;
       }
       return 0;
    }
    public int minStream(ArrayEntity array){
        if(array!=null&&array.getSize()>0){
           int min;
           int []arr=array.getArray();
           min= IntStream.of(arr).min().getAsInt();
           return min;
        }
        return 0;
    }

    public int max(ArrayEntity array){
        if(array!=null&&array.getSize()>0){
         int max=array.getElement(0);
         for(int i=1;i<array.getSize();i++){
             if(array.getElement(i)>max){
                 max=array.getElement(i);
             }
         }
         return max;
        }
        return 0;
    }

    public int maxStream(ArrayEntity array){
        if(array!=null&&array.getSize()>0){
            int min;
            int []arr=array.getArray();
            min= IntStream.of(arr).max().getAsInt();
            return min;
        }
        return 0;
    }
}
