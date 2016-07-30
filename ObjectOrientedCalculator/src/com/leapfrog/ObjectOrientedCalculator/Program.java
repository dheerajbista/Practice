/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ObjectOrientedCalculator;
import com.leapfrog.ObjectOrientedCalculator.util.Calculator;

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
        Calculator c = new Calculator(10,20);
        System.out.println(" Difference is  : " + c.sub());
        System.out.println(" Sum is \t: " + c.add());
        System.out.println(" Multiplication is \t: " + c.mul());
        System.out.println(" Division is \t: " + c.div());
        System.out.println(" Maximum is \t: " + c.ma());
        System.out.println(" Minimum \t: " + c.mn());
    }
    
}
