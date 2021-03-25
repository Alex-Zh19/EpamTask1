package com.epam.alex.sources;

import com.epam.alex.entity.ArrayEntity;

public class Changer {

    public void changeElements(ArrayEntity array, int replace, int by){
        for(int i=0;i<array.getSize();i++)
        {
            if(array.getElement(i)==replace){
                array.setElement(i,by);
            }
        }

    }
}
