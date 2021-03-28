package com.epam.alex.sources;

import com.epam.alex.entity.ArrayEntity;
import com.epam.alex.sources.impl.Sources;

public class Sleuth  implements Sources {

    public int min(ArrayEntity array){
       if(array!=null&&array.getSize()>0){
        int min=array.getElement(0);
        for(int i=1;i<array.getSize();i++){
            if(array.getElement(i)<min){
                min=array.getElement(i);
            }
        }
        return min;
       }
       return 0;
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
        }
        return 0;
    }
}
