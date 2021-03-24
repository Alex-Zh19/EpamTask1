package com.epam.alex.entity;

import com.epam.alex.sources.Definer;
import com.epam.alex.sources.Sleuth;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayMain {
    static final Logger logger= LogManager.getLogger();
    public static void main(String []args){
        MyArray arr=new MyArray(3);
        logger.log(Level.INFO,"array "+arr);

        Sleuth sleuth=new Sleuth();
        logger.log(Level.INFO,"min "+sleuth.min(arr));
        logger.log(Level.INFO,"max "+sleuth.max(arr));

        Definer definer=new Definer();
        logger.log(Level.INFO,"average "+definer.average(arr));
        logger.log(Level.INFO,"sum "+definer.sum(arr));
        logger.log(Level.INFO,"countOfPositive "+definer.countOfPositive(arr));
    }
}
