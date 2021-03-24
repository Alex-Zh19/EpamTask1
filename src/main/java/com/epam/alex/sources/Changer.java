package com.epam.alex.sources;

public class Changer {

    public int[]changeElements(int []array,int replace,int by){
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==replace){
                array[i]=by;
            }
        }
        return array;

    }
}
