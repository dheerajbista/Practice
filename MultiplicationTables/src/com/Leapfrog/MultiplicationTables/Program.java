/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leapfrog.MultiplicationTables;
import com.Leapfrog.MultiplicationTables.utilities.Calculation;
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
        Calculation c = new Calculation();
        while (true){
        System.out.println("Entet the value of x: ");
        c.setX(input.nextInt());
        System.out.println("Enter the value of y: ");
        c.setY(input.nextInt());
        
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Mul");
            System.out.println("4. Div");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("7. Multiplication Table");
            System.out.println("Enter your choice");
            int ch =input.nextInt();
            if (ch==1)
            {
                System.out.println("Sum is " + c.add());        
            }
            else if(ch==2)
            {
                System.out.println("Differnce is " + c.sub());
            }
            else if(ch==3)
            {
                System.out.println("Multiplication is " + c.mul());
            }
            else if(ch==4)
            {
                System.out.println("Quotient is " + c.div());
            }
            else if(ch==5)
            {
                System.out.println("Max value is " + c.ma());
            }
            else if(ch==6)
            {
                System.out.println("Differnce is " + c.mn());
            }
            else if(ch==7)
            {
                c.tbl();
            }
            else
            {
                System.exit(0);
            }
           
            System.out.println("Press any key to continue or press E to exit");
            String choice = input.next();
            if (choice.equalsIgnoreCase("e")){
                System.exit(0);
            }
        }
    } 
    
}
