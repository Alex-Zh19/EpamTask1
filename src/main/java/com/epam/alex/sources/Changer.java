package com.epam.alex.sources;

import by.epam.alex.entity.MyArray;

public class Changer {

    public MyArray changeElements(MyArray array, int replace, int by){
        for(int i=0;i<array.getSize();i++)
        {
            if(array.getElement(i)==replace){
                array.setElement(i,by);
            }
        }
        return array;

    }
}
