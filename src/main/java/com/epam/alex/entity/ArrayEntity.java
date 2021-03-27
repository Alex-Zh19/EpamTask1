package com.epam.alex.entity;

import java.util.Arrays;
import java.util.Objects;

public class ArrayEntity {

    int []array;
    int size;

    public ArrayEntity(){
        this.size=5;
        this.array=new int[size];
        createArray();
    }

    public ArrayEntity(int size){
       if(size>0){
        this.size=size;
        this.array=new int[size];
           createArray();
       }

    }

    public ArrayEntity(int []arr){
       if(arr.length>0) {
           this.size = arr.length;
           this.array = new int[size];
           createArray(arr);
       }
    }

    private void createArray(){
        for (int i=0;i<size;i++){
          array[i]=(int) (-100+Math.random()*100);
        }
    }

    private void createArray(int []arr){
        for (int i=0;i<size;i++){
            array[i]=arr[i];
        }
    }

    public int getSize(){
        return  this.size;
    }

    public int getElement(int pos){
        if(pos<array.length&&pos>=0){
            return array[pos];
        }
       return -111;
    }

    public int []getArray(){
        return Arrays.copyOf(array,array.length);
    }

    public void setArray(int []arr){
        array=Arrays.copyOf(arr,arr.length);
    }

    public void setElement(int pos,int el){
        if(pos<array.length&&pos>=0){
            array[pos]=el;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayEntity myArray = (ArrayEntity) o;
        return size == myArray.size && Arrays.equals(array, myArray.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return "ArrayEntity{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}