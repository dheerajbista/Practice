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
public class VolleyBall extends Ball {

    @Override
    public void play() {
        System.out.println("Played with hands 6 players");
    }

    @Override
    public void refil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
