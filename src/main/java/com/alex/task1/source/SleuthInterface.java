package com.alex.task1.source;

import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;

public interface SleuthInterface {
    int min(ArrayEntity array) throws ArrayEntityException;

    int minStream(ArrayEntity array) throws ArrayEntityException;

    int max(ArrayEntity array);

    int maxStream(ArrayEntity array) throws ArrayEntityException;
}
