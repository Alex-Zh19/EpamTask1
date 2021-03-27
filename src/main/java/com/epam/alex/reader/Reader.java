package com.epam.alex.reader;

import com.epam.alex.exception.ArrayEntityException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Reader {
    public List<String> readFile() {
        List<String> allStrings= new ArrayList<>();
        String str;
        File file = new File("C:\\Users\\Asus\\IdeaProjects\\EpamTask1\\Input data\\array.txt");
        BufferedReader bufferedReader = null;
        FileReader fileReader= null;

        try
        {
            fileReader = new FileReader(file);

            bufferedReader = new BufferedReader(fileReader);
            str=bufferedReader.readLine();
            while(str!=null){
                if(!str.isEmpty()){
                allStrings.add(str);
                }
                str= bufferedReader.readLine();
            }

        }catch(FileNotFoundException e)
        {
            try{
                throw new ArrayEntityException(e);
            }catch (ArrayEntityException ex){

            }
        }
        catch(IOException ioe)
        {
            try{
                throw new ArrayEntityException(ioe);
            }catch (ArrayEntityException ex){

            }
        }


        finally
        {
            try{
                if(bufferedReader != null && fileReader!=null)
                {
                    fileReader.close();
                    bufferedReader.close();

                }
            }catch(IOException ioe)
            {
                try{
                    throw new ArrayEntityException(ioe);
                }catch (ArrayEntityException ex){

                }
            }
        }
        return allStrings;
    }
}

