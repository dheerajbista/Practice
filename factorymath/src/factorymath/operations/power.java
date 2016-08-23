/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymath.operations;

/**
 *
 * @author AT
 */
public class power extends mathcommand{
    
    @Override
    public double execute(double x, double y) {
        double z=x;
        System.out.println(x);
        for (int i=1;i<=y-1;i++){
            z = x*z;
        }
        System.out.println("result");
        return z;
    }
    
    
}
