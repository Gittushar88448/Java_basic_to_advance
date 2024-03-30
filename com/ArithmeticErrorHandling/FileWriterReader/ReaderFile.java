package com.ArithmeticErrorHandling.FileWriterReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReaderFile {
    public static void main(String[] args) {

        String fileName = "javaLearning.txt";

        try(FileReader reader = new FileReader(fileName)) {

            int read = 0;
            do{
            read = reader.read();
                System.out.print((char)read);
            }while (read != -1);
        }catch (IOException exception){
            System.out.printf("Exception %s ", exception.getMessage());
        }
    }
}
