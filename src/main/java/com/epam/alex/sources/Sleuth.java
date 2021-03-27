package com.epam.alex.sources;

import com.epam.alex.entity.ArrayEntity;

public class Sleuth {

    public int min(ArrayEntity array){
        //не ноль
        int min=array.getElement(0);
        for(int i=1;i<array.getSize();i++){
            if(array.getElement(i)<min){
                min=array.getElement(i);
            }
        }
        return min;
    }

    public int max(ArrayEntity array){
        //не ноль
        int max=array.getElement(0);
        for(int i=1;i<array.getSize();i++){
            if(array.getElement(i)>max){
                max=array.getElement(i);
            }
        }
        return max;
    }
}
