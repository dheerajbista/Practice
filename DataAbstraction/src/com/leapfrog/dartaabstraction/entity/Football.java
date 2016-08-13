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
public class Football extends Ball  {

    @Override
    public void play() {
        System.out.println("Played by foot");
    }

    @Override
    public void setSize(int size) {
        super.setSize(size); //To change body of generated methods, choose Tools | Templates.
        System.out.println("size is " + size);
    }

    @Override
    public void refil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
