package com.ArithmeticErrorHandling.FileWriterReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ChallengeFile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file name which you want to print the data of : ");
        String fileName = input.next();

        try(FileReader reader = new FileReader(fileName)) {
            int character;
            while ((character = reader.read()) != -1){
                System.out.print((char)character);
            }

        }catch (FileNotFoundException exception){
            System.out.printf("%s not found", fileName);
        }

        catch (IOException exception){
            System.out.printf("Exception occured : %s", exception.getMessage());
        }

    }

}
