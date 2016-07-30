/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ObjectOrientedCalculator.util;

/**
 *
 * @author AT
 */
public class Calculator {
    private int x,y;
    public Calculator(){
        
    }
    public Calculator(int x, int y){
        this.x=x;
        this.y=y;
    }
      public int add(){
          return(x+y);
      }
      public int sub(){
          return(x-y);
      }
      public int mul(){
          return(x*y);
      }
      public double div (){
          return(x/y);
      }
    public double ma(){
        return Double.max(x, y);
    }
     public double mn(){
         return Double.min(x, y); 
     } 
     
}
