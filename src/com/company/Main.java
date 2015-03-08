package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
	// write your code here
        try {
            //Scanner input = new Scanner(System.in);
           // System.out.print("Enter the file name with extension: ");
            File file = new File("swag.txt");

            Scanner input = new Scanner(file);


            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
