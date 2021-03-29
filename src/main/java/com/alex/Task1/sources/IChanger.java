package com.alex.Task1.sources;

import com.alex.Task1.entity.ArrayEntity;

public interface IChanger {
    void changeElements(ArrayEntity array, int replace, int by);
    void changeElementsStream(ArrayEntity arrayEntity, int replace, int by);
}
