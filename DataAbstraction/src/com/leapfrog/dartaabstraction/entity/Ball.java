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
public abstract class Ball implements Playable, refilable{
     private int size;
    public abstract void play();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
