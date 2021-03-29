package com.alex.task1.source;

import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;

public interface DefinerInterface {
    double average(ArrayEntity array) throws ArrayEntityException;

    double averageStream(ArrayEntity arrayEntity) throws ArrayEntityException;

    int sum(ArrayEntity array) throws ArrayEntityException;

    int sumStream(ArrayEntity arrayEntity) throws ArrayEntityException;

    int countOfPositive(ArrayEntity array) throws ArrayEntityException;

    int countOfPositiveStream(ArrayEntity arrayEntity) throws ArrayEntityException;

    int countOfNegative(ArrayEntity array) throws ArrayEntityException;

    int countOfNegativeStream(ArrayEntity arrayEntity) throws ArrayEntityException;
}
