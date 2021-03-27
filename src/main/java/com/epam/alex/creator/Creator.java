package com.epam.alex.creator;

import com.epam.alex.entity.ArrayEntity;

public class Creator {
    public ArrayEntity createArrayEntity(Integer[]integers){
        //try catch блок чтоб массив не равен нулю
        ArrayEntity arrayEntity=new ArrayEntity(integers);
        return arrayEntity;
    }
}
