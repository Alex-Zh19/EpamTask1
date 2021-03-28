package com.epam.alex.sources.impl;

import com.epam.alex.entity.ArrayEntity;
import com.epam.alex.sources.IDefiner;

import java.util.stream.IntStream;

public class Definer implements IDefiner {

    public double average(ArrayEntity array){
        if(array!=null&&array.getSize()>0){
          double result=0.0;
          for(int i=0;i<array.getSize();i++){
              result+= array.getElement(i);
          }
          result=result/(array.getSize());
          return result;
        }
        return 0.0;
    }

    public double averageStream(ArrayEntity arrayEntity){
        if(arrayEntity!=null&&arrayEntity.getSize()>0){
            double result;
            int []arr=arrayEntity.getArray();
            result= IntStream.of(arr).average().getAsDouble();
            return result;
        }
        return 0.0;
    }

    public int sum(ArrayEntity array){
        if(array!=null&&array.getSize()>0){
         int sum=0;
         for(int i=0;i<array.getSize();i++){
             sum+= array.getElement(i);
         }
         return sum;
        }
        return 0;
    }

    public int sumStream(ArrayEntity arrayEntity){
        if(arrayEntity!=null&&arrayEntity.getSize()>0){
            int sum;
            int []arr=arrayEntity.getArray();
            sum=IntStream.of(arr).sum();
            return sum;
        }
        return 0;
    }

    public int countOfPositive(ArrayEntity array){
        if(array!=null&&array.getSize()>0) {
            int count = 0;
            for (int i = 0; i < array.getSize(); i++) {
                if (array.getElement(i) > 0) {
                    count++;
                }
            }
            return count;
        }
        return -1;
    }

    public int countOfPositiveStream(ArrayEntity arrayEntity){
        if(arrayEntity!=null&&arrayEntity.getSize()>0){
            int count;
            int []arr= arrayEntity.getArray();
            count=(int)IntStream.of(arr).filter(i->i>0).count();
            return count;
        }
        return -1;
    }
    public int countOfNegative(ArrayEntity array){

        if(array!=null&&array.getSize()>0) {
            int count = 0;
            for (int i = 0; i < array.getSize(); i++) {
                if (array.getElement(i) < 0) {
                    count++;
                }
            }
            return count;
        }
        return -1;
    }

    public int countOfNegativeStream(ArrayEntity arrayEntity){
        if(arrayEntity!=null&&arrayEntity.getSize()>0){
            int count;
            int []arr= arrayEntity.getArray();
            count=(int)IntStream.of(arr).filter(i->i<0).count();
            return count;
        }
        return -1;
    }
}
