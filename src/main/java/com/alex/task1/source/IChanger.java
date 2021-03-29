package com.alex.task1.source;

import com.alex.task1.entity.ArrayEntity;

public interface IChanger {
    void changeElements(ArrayEntity array, int replace, int by);
    void changeElementsStream(ArrayEntity arrayEntity, int replace, int by);
}
