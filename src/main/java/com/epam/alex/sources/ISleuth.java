package com.epam.alex.sources;

import com.epam.alex.entity.ArrayEntity;

public interface ISleuth {
    int min(ArrayEntity array);
    int minStream(ArrayEntity array);
    int max(ArrayEntity array);
    int maxStream(ArrayEntity array);
}
