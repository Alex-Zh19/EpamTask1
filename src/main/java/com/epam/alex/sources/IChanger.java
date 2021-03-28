package com.epam.alex.sources;

import com.epam.alex.entity.ArrayEntity;

public interface IChanger {
    void changeElements(ArrayEntity array, int replace, int by);
    void changeElementsStream(ArrayEntity arrayEntity, int replace, int by);
}
