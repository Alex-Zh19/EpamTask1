package com.epam.alex.sources.impl;

import com.epam.alex.entity.ArrayEntity;
import com.epam.alex.sources.IChanger;

import java.util.stream.IntStream;

public class Changer implements IChanger {

    public void changeElements(ArrayEntity array, int replace, int by){
        if(array!=null&&array.getSize()>0) {
            for (int i = 0; i < array.getSize(); i++) {
                if (array.getElement(i) == replace) {
                    array.setElement(i, by);
                }
            }
        }
    }

    public void changeElementsStream(ArrayEntity arrayEntity, int replace, int by){
        if(arrayEntity!=null&&arrayEntity.getSize()>0){
            int []arr=arrayEntity.getArray();
            arr= IntStream.of(arr).map(i->(i==replace)?(i=by):(i=i)).toArray();
            arrayEntity.setArray(arr);
        }

    }
}
