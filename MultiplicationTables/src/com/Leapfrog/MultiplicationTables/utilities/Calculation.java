/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leapfrog.MultiplicationTables.utilities;

/**
 *
 * @author AT
 */
public class Calculation {

    private int x, y;

    public Calculation() {

    }

    public Calculation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int add() {
        return (x + y);
    }

    public int sub() {
        return (x - y);
    }

    public int mul() {
        return (x * y);
    }

    public double div() {
        return (x / y);
    }

    public double ma() {
        return (Double.max(x, y));
    }

    public double mn() {
        return (Double.min(x, y));
    }

    public void tbl() {
        int z = x;
        for (int i = 1; i <= y; i++) {
            z = x * i;
            System.out.print(x);
            System.out.print("x" + i );
            System.out.print("=" + z );
            System.out.println("");
        }
    }
}
