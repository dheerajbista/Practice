/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayexample;

import java.io.IOException;

/**
 *
 * @author AT
 */
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        boolean found = false;
        int s = 31;
        int[] number = {40, 20, 5, 30, 10};

        //linear serch
        for (int i = 0; i < number.length; i++) {
            if (s == number[i]) {
                found = true;
                break;
            }
        }

        if (found == true) {
            System.out.println(s + " is in the array ");
        } else {
            System.out.println(s + " is not in the array");
        }

            // linear sort
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

            //binary search
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        int mid = number.length / 2;
        if(mid<s){
            for(int i=mid+1;i<number.length;i++){
                if (s==number[i]){
                    found=true;
                    break;
                }
            }
        }
        System.out.println("linear sorted " + number[mid]);

    }

}
