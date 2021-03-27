package com.epam.alex.reader;

import java.io.*;
import java.util.ArrayList;

public class Reader {
    public ArrayList<String>readFile(){
        //пофиксить эксепшены
        ArrayList<String>allStrings=new ArrayList<>();
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

        }catch(FileNotFoundException fnfe)
        {
            System.out.println("The specified file not found" + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("I/O Exception: " + ioe);
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
                System.out.println("Error in InputStream close(): " + ioe);
            }
        }
        return allStrings;
    }
}

