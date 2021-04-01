package com.alex.task1.entity;


import java.util.Arrays;

public class ArrayEntity {

    private int[] array;


    public ArrayEntity(int size) {
        if (size >= 0) {
            array = new int[size];
        }
    }

    public int getSize() {
        return array.length;
    }


    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] arr) {
        array = Arrays.copyOf(arr, arr.length);
    }

    public void setArray(Integer[] arr)  {
        array = new int[arr.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i];
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayEntity ArrayEntity = (ArrayEntity) o;
        return array.length == ArrayEntity.array.length && Arrays.equals(array, ArrayEntity.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}