package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class T2_File implements Runnable{

    @Override
    public void run() {
        File file =new File("Java.txt");
        String text="";
        int ascii;
        try {
            FileReader fileReader = new FileReader(file);
            while ((ascii=fileReader.read())!=-1){
                    text+=(char)ascii;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("your text : " + text);
    }
}
