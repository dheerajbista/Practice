/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leapfrog.slc;

import java.util.Scanner;
import util.marksheet;

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
        marksheet m = new marksheet(input);
        int totalpass = 0, totalfail=0;
        while (true) {
            m.entry();
            m.totalpassfail();
            if (m.isFail()) {
                System.out.println("You are fail");
            } else {
                System.out.println("Total is : " + m.getTotal());
                System.out.println("Percentage is : " + m.getPercentage());
                System.out.println("Grade is : " + m.getGrade());
            }
            System.out.println("Do you want to continue [Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }

}
