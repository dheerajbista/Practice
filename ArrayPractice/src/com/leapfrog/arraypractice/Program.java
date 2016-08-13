/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.arraypractice;

import java.util.Scanner;

/**
 *
 * @author AT
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double total = 0;
        String[] students = {"Ajit", "Bishnu", "Chetan"};
        String[] subjects = {"english", "Nepali", "Math"};
        double[][] marks = new double[students.length][subjects.length];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + students[i]);
            for (int j = 0; j < marks.length; j++) {
                System.out.print("Enter the marks for " + subjects[j] +" ");
                marks[i][j]=input.nextDouble();
                total+=marks[i][j];
                
            }
            System.out.println("Total is " +total);
            total = 0;
            
        }
        
    }

}
