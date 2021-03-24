package com.epam.alex.sources;

import com.epam.alex.entity.MyArray;

public class Definer {

    public double average(MyArray array){
        double result=0.0;
      for(int i=0;i<array.getSize();i++){
          result+= array.getElement(i);
      }
        result=result/(array.getSize());
        return result;
    }

    public int sum(MyArray array){
        int sum=0;
        for(int i=0;i<array.getSize();i++){
            sum+= array.getElement(i);
        }
        return sum;
    }

    public int countOfPositive(MyArray array){
        int count =0;
        for(int i=0;i<array.getSize();i++){
            if(array.getElement(i)>0){
                count++;
            }
        }
        return count;
    }

    public int countOfNegative(MyArray array){
        int count =0;
        for(int i=0;i<array.getSize();i++){
            if(array.getElement(i)<0){
                count++;
            }
        }
        return count;
    }
}
