package com.alex.Task1.sources.impl;

import com.alex.Task1.entity.ArrayEntity;
import com.alex.Task1.sources.ISleuth;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class Sleuth implements ISleuth {
    final String NULLARRAYEXCEPTION="array isn't exist";
    static Logger logger= LogManager.getLogger();
    public int min(ArrayEntity array){
       if(array!=null&&array.getSize()>0){
        int min=array.getElement(0);
        for(int i=1;i<array.getSize();i++){
            if(array.getElement(i)<min){
                min=array.getElement(i);
            }
        }
        return min;
       }else{
           logger.log(Level.ERROR,NULLARRAYEXCEPTION);
           return 0;
       }

    }
    public int minStream(ArrayEntity array){
        if(array!=null&&array.getSize()>0){
           int min;
           int []arr=array.getArray();
           min= IntStream.of(arr).min().getAsInt();
           return min;
        }else{
            logger.log(Level.ERROR,NULLARRAYEXCEPTION);
            return 0;
        }

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
        }else{
            logger.log(Level.ERROR,NULLARRAYEXCEPTION);
            return 0;
        }

    }

    public int maxStream(ArrayEntity array){
        if(array!=null&&array.getSize()>0){
            int min;
            int []arr=array.getArray();
            min= IntStream.of(arr).max().getAsInt();
            return min;
        }else{
            logger.log(Level.ERROR,NULLARRAYEXCEPTION);
            return 0;
        }

    }
}
