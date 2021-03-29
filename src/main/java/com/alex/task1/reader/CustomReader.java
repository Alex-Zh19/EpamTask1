package com.alex.task1.reader;

import com.alex.task1.exception.ArrayEntityException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CustomReader {
    public List<String> readFile() throws ArrayEntityException {
        List<String> allStrings = new ArrayList<>();
        String str;
        String path = "C:\\Users\\Asus\\IdeaProjects\\EpamTask1\\src\\main\\resources\\Input data\\array.txt";
        File file = new File(path);


        try(FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader)) {

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

        }
        return allStrings;
    }
}

