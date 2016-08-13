/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dartaabstraction;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AT
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application l ogic here
        
// Ball b = new BasketBall();
// Playable p = b;
//        p.play();
//        
//        refilable r = new BasketBall();
//                r.refil();
//        BallFactory bf = new BallFactory();
//       Ball b = bf.get("fb");
//       b.play();
        
        
//        List<String> names = new ArrayList<>)();
//        names.add("dheeraj);
//        

        System.out.println("hi");
        List<String> name = new ArrayList<>();
        name.add("dheeraj");
        System.out.println(name.size());
        
        name.add("Bista");
        System.out.println(name.get(0));
        
        for (String s:name){
            System.out.println(s);
        }
        name.forEach(ss->{
        System.out.println(ss);
    });
        
    }
    
    
}
