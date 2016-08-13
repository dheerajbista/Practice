/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dartaabstraction.entity;

/**
 *
 * @author AT
 */
public class BallFactory {
    public Ball get(String param){
        if(param.equalsIgnoreCase("fb")){
            return new Football()  ;
        }
        return null;
       
    }
    
}
