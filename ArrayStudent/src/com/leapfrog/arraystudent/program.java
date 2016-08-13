/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.arraystudent;

import com.leapfrog.arraystudent.entity.Student;
import java.util.Scanner;

/**
 *
 * @author AT
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        int counter = 0;
        Student[] studentList = new Student[2];
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Show All");
            System.out.println("3. Exit");
            System.out.println("Entet the selection");
            int choice = input.nextInt();
            if (choice == 1) {

                Student s = new Student();
                System.err.println("Entet ID : ");
                s.setID(input.nextInt());
                System.out.println("Enter First Name : ");
                s.setFirstName(input.next());
                System.out.println("Enter Last Name : ");
                s.setLastName(input.next());
                System.out.println("Enter Email : ");
                s.setEamil(input.next());
                System.out.println("Enter Contact No. : ");
                s.setContactNo(input.next());
                System.out.println("Enter Status : ");
                s.setStatus(input.nextBoolean());
                studentList[counter] = s;
                counter++;

            } else if (choice == 2) {
                for (int i = 0; i < studentList.length; i++) {
                    Student std = studentList[i];
                    if (std != null) {
                        System.out.println(std.getFullName());
                    }
                }
            }
            System.out.println("DO you want to quit [Y/N]");
            if (input.next().equalsIgnoreCase("Y")) {
                System.exit(0);
            }
        }

//        String name = "Ram";
//        String name1 = new String("Ram");
//        System.out.println(name == name1);
//        System.out.println(name.equalsIgnoreCase(name1));
    }

}
