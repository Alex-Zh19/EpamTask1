package com.alex.task1.source;

import com.alex.task1.entity.ArrayEntity;

public interface IDefiner {
    double average(ArrayEntity array);
    double averageStream(ArrayEntity arrayEntity);
    int sum(ArrayEntity array);
    int sumStream(ArrayEntity arrayEntity);
    int countOfPositive(ArrayEntity array);
    int countOfPositiveStream(ArrayEntity arrayEntity);
    int countOfNegative(ArrayEntity array);
    int countOfNegativeStream(ArrayEntity arrayEntity);
}
