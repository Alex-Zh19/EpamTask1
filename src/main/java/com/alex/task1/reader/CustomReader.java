package com.alex.task1.reader;

import com.alex.task1.exception.ArrayEntityException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CustomReader {
    public List<String> readFile() throws ArrayEntityException {
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
            throw new ArrayEntityException(e, e.getMessage());
        } catch (IOException ioe) {
            throw new ArrayEntityException(ioe, ioe.getMessage());

        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();

                }
            } catch (IOException ioe) {
                throw new ArrayEntityException(ioe, ioe.getMessage());
            }
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException ioe) {
                throw new ArrayEntityException(ioe, ioe.getMessage());
            }
        }
        return allStrings;
    }
}

