/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author AT
 */
public class Dummy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        try {
            String [] s;
            FileWriter writer = new FileWriter("d:/leapfrog/file1.txt");
            writer.write(input.next(System.in));
            writer.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
//        try{
//        byte[] buffer = new byte[1024];
//        int len = in.read(buffer);
//        while (len != -1) {
//        out.write(buffer, 0, len);
//        len = in.read(buffer);
//        }
//        }
//        catch (Exception e)
//                {
//                System.out.println(e.getMessage());
//                }
//        Scanner input = new Scanner(System.in);
//        String s = "";
//        try {
//            FileWriter writer = new FileWriter("d:/leapfrog/file1.txt");
//            do{
//                s = input.next();
//                writer.write(s);
//                s="";
//            }while((input.next()).equalsIgnoreCase("exit"));
//                writer.close();
//            } 
//        catch (IOException ioe) {
//            System.out.println(ioe.getMessage());
//        }
//
//        try {
//            String path = "d:/leapfrog/file1.txt";
//            FileReader reader = new FileReader(path);
//            int i = 0;
//            while ((i = reader.read()) != -1) {
//                System.out.print((char) i);
//            }
//            reader.close();
//        } catch (IOException ioe) {
//            System.out.println(ioe.getMessage());
//        }

    }
}
