package com.alex.task1.reader;

import com.alex.task1.exception.ArrayEntityException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Reader {
    public List<String> readFile() {
        List<String> allStrings = new ArrayList<>();
        String str;
        String path = "C:\\Users\\Asus\\IdeaProjects\\EpamTask1\\Input data\\array.txt";
        File file = new File(path);
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);

            bufferedReader = new BufferedReader(fileReader);
            str = bufferedReader.readLine();
            while (str != null) {
                if (!str.isEmpty()) {
                    allStrings.add(str);
                }
                str = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            try {
                throw new ArrayEntityException(e, e.getMessage());
            } catch (ArrayEntityException ex) {

            }
        } catch (IOException ioe) {
            try {
                throw new ArrayEntityException(ioe, ioe.getMessage());
            } catch (ArrayEntityException ex) {

            }
        } finally {
            try {
                if (bufferedReader != null && fileReader != null) {
                    fileReader.close();
                    bufferedReader.close();

                }
            } catch (IOException ioe) {
                try {
                    throw new ArrayEntityException(ioe, ioe.getMessage());
                } catch (ArrayEntityException ex) {

                }
            }
        }
        return allStrings;
    }
}

