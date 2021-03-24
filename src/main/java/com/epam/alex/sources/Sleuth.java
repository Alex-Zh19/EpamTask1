package com.epam.alex.sources;

import by.epam.alex.entity.MyArray;

public class Sleuth {

    public int min(MyArray array){
        int min=array.getElement(0);
        for(int i=1;i<array.getSize();i++){
            if(array.getElement(i)<min){
                min=array.getElement(i);
            }
        }
        return min;
    }

    public int max(MyArray array){
        int max=array.getElement(0);
        for(int i=1;i<array.getSize();i++){
            if(array.getElement(i)>max){
                max=array.getElement(i);
            }
        }
        return max;
    }
}
