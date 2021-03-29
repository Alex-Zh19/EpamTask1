package com.alex.task1.source;

import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;

public interface ChangerInterface {
    void changeElements(ArrayEntity array, int replace, int by) throws ArrayEntityException;

    void changeElementsStream(ArrayEntity arrayEntity, int replace, int by) throws ArrayEntityException;
}
