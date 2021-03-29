package com.epam.alex.entity;

import java.util.Arrays;
import java.util.Objects;

public class ArrayEntity {

    int []array;

    public ArrayEntity(){
        int size=5;
        this.array=new int[size];
        init();
    }

    public ArrayEntity(int size)  {
       if(size>0){
        this.array=new int[size];
           init();
       }

    }

    public ArrayEntity(int []arr) {
       if(arr.length>0) {
           int size = arr.length;
           this.array = new int[size];
           init(arr);
       }

    }

    public ArrayEntity(Integer []arr)  {
        if(arr.length>0) {
            int size = arr.length;
            this.array = new int[size];
            init(arr);
        }
    }

    private void init(){
        for (int i=0;i<array.length;i++){
          array[i]=(int) (-100+Math.random()*100);
        }
    }

    private void init(int []arr){
        for (int i=0;i<array.length;i++){
            array[i]=arr[i];
        }
    }

    private void init(Integer []arr){
        for (int i=0;i<array.length;i++){
            array[i]=arr[i];
        }
    }

    public int getSize(){
        return  array.length;
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
        return array.length == myArray.array.length && Arrays.equals(array, myArray.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(array.length);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return "ArrayEntity{" +
                "array=" + Arrays.toString(array) +
                ", size=" + array.length +
                '}';
    }
}