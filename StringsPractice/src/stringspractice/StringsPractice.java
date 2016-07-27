/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringspractice;

/**
 *
 * @author AT
 */
public class StringsPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstName = "Dheeraj";
        String lastName = "Bista";
        String tot;
        tot = (firstName +" "+ lastName);
        String low = (firstName +" "+ lastName).toLowerCase();
        String upp = (firstName +" "+ lastName);
        int len = (firstName +" "+ lastName).length(); 
        System.out.println("Full name : "+ tot);
        System.out.println("Full name : "+ low);
        System.out.println(len);
        System.out.println(lastName.compareTo(firstName));
        System.out.println(firstName.charAt(6));
    }
    
}
