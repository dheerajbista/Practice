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
public class operator {
    
    public static mathcommand get(String param){
        
        switch (param) {
            case "+":
                return new add();
            case "-":
                return new sub();
            case "*":
                return new mul();
            case "/":
                return new div();
            case "^":
                return new power();
        }
        return null;
    }
    
}
