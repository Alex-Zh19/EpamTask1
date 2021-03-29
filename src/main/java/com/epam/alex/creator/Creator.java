package com.epam.alex.creator;

import com.epam.alex.entity.ArrayEntity;
import com.epam.alex.exception.ArrayEntityException;

public class Creator {
    public ArrayEntity createArrayEntity(Integer[]integers) {
      if(integers.length>0){
            ArrayEntity arrayEntity = new ArrayEntity(integers);
            return arrayEntity;
      }
      return null;
    }


}
