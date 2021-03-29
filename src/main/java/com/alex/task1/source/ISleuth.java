package com.alex.task1.source;

import com.alex.task1.entity.ArrayEntity;

public interface ISleuth {
    int min(ArrayEntity array);
    int minStream(ArrayEntity array);
    int max(ArrayEntity array);
    int maxStream(ArrayEntity array);
}
