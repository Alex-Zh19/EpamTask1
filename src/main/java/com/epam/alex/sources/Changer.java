package com.epam.alex.sources;

import com.epam.alex.entity.ArrayEntity;
import com.epam.alex.sources.impl.Sources;

public class Changer implements Sources {

    public void changeElements(ArrayEntity array, int replace, int by){
        if(array!=null) {
            for (int i = 0; i < array.getSize(); i++) {
                if (array.getElement(i) == replace) {
                    array.setElement(i, by);
                }
            }
        }
    }
}
