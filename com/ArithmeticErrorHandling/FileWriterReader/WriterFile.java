package com.ArithmeticErrorHandling.FileWriterReader;

import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {

    public static void main(String[] args) {
        String fileName = "javaLearning.txt";

        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("Hello this is the first file");
            writer.flush();
            System.out.println("Message written successfully");
        }catch (IOException exception){
            System.out.printf("Exception occur %s: ", exception.getMessage());
        }
    }

}
