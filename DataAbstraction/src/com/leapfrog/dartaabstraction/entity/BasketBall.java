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
public class BasketBall extends Ball{

    @Override
    public void play() {
        System.out.println("Played with hands dribbling");        
    }

    @Override
    public void refil() {
        System.out.println("Ball refill");
    }

    
    }
