package by.epam.alex.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Objects;

public class MyArray {
    static final Logger logger=LogManager.getLogger();
    int []array;
    int size;

    MyArray(){
        this.size=10;
        this.array=new int[size];
        setArray();
    }

    MyArray(int size){
        this.size=size;
        this.array=new int[size];
        setArray();
    }

    MyArray(int []arr){
        this.size=arr.length;
        this.array=new int[size];
        setArray(arr);
    }

    private void setArray(){
        for (int i=0;i<size;i++){
          array[i]=(int) (0+Math.random()*100);
        }
    }

    private void setArray(int []arr){
        for (int i=0;i<size;i++){
            array[i]=arr[i];
        }
    }

    public int getSize(){
        return  this.size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArray myArray = (MyArray) o;
        return size == myArray.size && Arrays.equals(array, myArray.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}