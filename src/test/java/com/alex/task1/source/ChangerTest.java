package com.alex.task1.source;

import com.alex.task1.creator.EntityCreator;
import com.alex.task1.entity.ArrayEntity;
import com.alex.task1.exception.ArrayEntityException;
import com.alex.task1.source.impl.Changer;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChangerTest {
    @Test
    public void testChangeElements() throws ArrayEntityException {
        //given
        Changer changer = new Changer();
        int[] arr = new int[]{5, 7, 12, 7, -1, -2, 1, -1, 5, 7, 7, 8, 5, 7};
        EntityCreator entityCreator = new EntityCreator();

        ArrayEntity arrayEntityActual = entityCreator.createArrayEntity(arr);

        int[] arr2 = new int[]{5, 0, 12, 0, -1, -2, 1, -1, 5, 0, 0, 8, 5, 0};

        ArrayEntity arrayEntityExpected = entityCreator.createArrayEntity(arr2);

        //when
        try {
            changer.changeElements(arrayEntityActual, 7, 0);
        } catch (ArrayEntityException e) {

        }
        //then
        assertEquals(arrayEntityActual, arrayEntityExpected);
    }

    @Test
    public void testChangeElementsStream() throws ArrayEntityException {
        //given
        Changer changer = new Changer();
        int[] arr = new int[]{5, 7, 12, 7, -1, -2, 1, -1, 5, 7, 7, 8, 5, 7};
        EntityCreator entityCreator = new EntityCreator();

        ArrayEntity arrayEntityActual = entityCreator.createArrayEntity(arr);

        int[] arr2 = new int[]{5, 0, 12, 0, -1, -2, 1, -1, 5, 0, 0, 8, 5, 0};
        ArrayEntity arrayEntityExpected = entityCreator.createArrayEntity(arr2);
        //when
        try {
            changer.changeElementsStream(arrayEntityActual, 7, 0);
        } catch (ArrayEntityException e) {

        }
        //then
        assertEquals(arrayEntityActual, arrayEntityExpected);
    }
}