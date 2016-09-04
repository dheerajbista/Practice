/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.pointofsale.ui;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author AT
 */
public class menu extends JFrame{
    
    public menu(){
        
        setTitle("Menu Options");
        setSize(367, 367);
        setLayout(new FlowLayout(FlowLayout.CENTER));
//        initcomponents();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
