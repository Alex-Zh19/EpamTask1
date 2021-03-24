package com.epam.alex.sources;

public class Definer {

    public double average(int []array){
        double result=0.0;
        for(int i:array){
            result+=i;
        }
        result=result/(array.length+1);
        return result;
    }

    public int sum(int []array){
        int sum=0;
        for (int i:array){
            sum+=i;
        }
        return sum;
    }

    public int countOfPositive(int []array){
        int count =0;
        for(int i:array){
            if(i>0){
                count++;
            }
        }
        return count;
    }

    public int countOfNegative(int []array){
        int count =0;
        for(int i:array){
            if(i<0){
                count++;
            }
        }
        return count;
    }
}
