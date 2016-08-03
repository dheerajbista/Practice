/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leapfrog.fileExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author AT
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("d:/leapfrog/file1.txt");
            writer.write("This is example 123");
            writer.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        try {
            String path = "d:/leapfrog/file1.txt";
            FileReader reader = new FileReader(path);
            int i = 0;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
            reader.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        try {
            String path1 = "D:/leapfrog/file2.txt";
            BufferedReader breader = new BufferedReader(new FileReader(path1));
            String line = "";

            while ((line = breader.readLine()) != null) {
                String[] token = line.split(",");
                int x = Integer.parseInt(token[0]);
                String cmd = token[1];
                int y = Integer.parseInt(token[2]);
                switch (cmd) {
                    case "+":
                        System.out.println(x + y);
                        break;
                    case "-":
                        System.out.println(x - y);
                        break;
                    case "*":
                        System.out.println(x * y);
                        break;
                    case "/":
                        System.out.println(x/y);
                }
            }
            breader.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
