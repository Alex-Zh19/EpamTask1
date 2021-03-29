package com.alex.Task1.sources;

import com.alex.Task1.entity.ArrayEntity;

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
