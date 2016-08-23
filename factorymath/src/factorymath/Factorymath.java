/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymath;

import factorymath.operations.mathcommand;
import factorymath.operations.operator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author AT
 */
public class Factorymath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            String path = "D:/leapfrog/Programs/factorymath/math.txt";
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] token = line.split(",");
                double x = Double.parseDouble(token[0]);
                //int x = Integer.parseInt(token[0]);
                mathcommand cmd = operator.get(token[1]);
                double y = Double.parseDouble(token[2]);
                //int y = Integer.parseInt(token[2]);
                if (cmd!=null)
                {
                    System.out.println(cmd.execute(x, y));
                }               
    }
    
}catch(IOException e){
            System.out.println(e.getMessage());
}
    }
}
        
    
