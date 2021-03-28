package com.epam.alex.sources;

import com.epam.alex.entity.ArrayEntity;
import com.epam.alex.sources.impl.Sources;

public class Definer  implements Sources {

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
}
