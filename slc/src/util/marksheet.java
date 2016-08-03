/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author AT
 */
public class marksheet {

    private Scanner input;
    private double eng, nep, math, sc, acc, passmark =32, fullmark=500;
    int totalpass=0,totalfail=0;

    public marksheet(Scanner input) {
        this.input = input;
    }

    public void entry() {
        System.out.println("Enter the passmark : ");
        passmark=input.nextDouble();
        System.out.println("Enter Marks for English : ");
        eng = input.nextDouble();
        System.out.println("Enter Marks for Nepali : ");
        nep = input.nextDouble();
        System.out.println("Enter Marks for Maths : ");
        math = input.nextDouble();
        System.out.println("Enter Marks for Scinence : ");
        sc = input.nextDouble();
        System.out.println("Enter Marks for Accounts : ");
        acc = input.nextDouble();
    }

    public boolean isFail() {

        return (eng < passmark || nep < passmark || math < passmark || sc < passmark || acc < passmark);
    }

    public double getTotal() {
        return (eng + nep + math + sc + acc);
    }

    public double getPercentage() {
        return ((getTotal() / fullmark) * 100);
    }

    public String getGrade() {
        double percentage = getPercentage();
        String grade;
        if (percentage >= 80) {
            grade = "Distiction";
        } else if (percentage < 80 && percentage >= 60) {
            grade = "First Division";
        } else if (percentage < 60 && percentage > 40) {
            grade = "Second Division";
        } else {
            grade = "Third Division";
        }
        return (grade);
    }
    public void setPassmark(double passmark){
        this.passmark=passmark;
    }
    public void totalpassfail(){
        if (isFail()){
                totalfail++;
            }
            else
                totalpass++;
        System.out.println("Total pass: "+ totalpass);
        System.out.println("Total fail: "+ totalfail);
    }
}
