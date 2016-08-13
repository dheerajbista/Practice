/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fileio;
import com.leapfrog.fileio.command.DosCommand;
import com.leapfrog.fileio.command.DosFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *
 * @author AT
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
////            String filename = "D:/leapfrog/file sample.txt";
////            String filename2 = "D:/leapfrog/file sample2.txt";
////            File file = new File(filename);
////            System.out.println("Is File " + file.isFile());
////            System.out.println("Is Directory " + file.isDirectory() );
////            System.out.println("Absolute Path " + file.getAbsolutePath());
////            try {
////                System.out.println("Cannonical path" + file.getCanonicalPath());
////            } catch (IOException ex) {
////                Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
////            }
////            System.out.println("Free Space" + (file.getFreeSpace())/(1024*1024*1024) + "GB");
////            System.out.println("Total Space" + (file.getTotalSpace())/(1024*1024*1024) + "GB");
//////            if(!file.exists()){
//////            file.createNewFile();
//////                System.out.println("File is created");
//////            }else
//////            {
//////                file.delete();
//////                System.out.println("file is deleted");
//////            }
//////            System.out.println(file.isFile());
////            
//////            
//////            FileWriter writer = new FileWriter(filename);
//////            writer.write("1,Dheeraj,Bista");
//////            writer.close();
////            
////            BufferedReader reader = new BufferedReader(new FileReader(filename));
////            String line = "" ;
////            StringBuilder content = new StringBuilder();
////            while((line=reader.readLine())!= null ){
////                content.append(line).append("\r\n");
////                
////            }
////            
////            reader.close();
////            
////            FileWriter writer = new FileWriter(filename2);
////            writer.write(content.toString());
////            writer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line ="";
            File file = new File(".");
            String path= file.getAbsolutePath();
            System.out.print(path + ">");
            while(!(line=reader.readLine()).equalsIgnoreCase("exit")){
                
                String [] tokens  = line.split(" ");
                
                DosCommand cmd = new DosFactory().get(tokens [0]);
                        if (cmd != null)
                        {
                            cmd.execute(tokens);
                            
                        }
                        else {
                            System.out.println("Invalid Command");
                        }
                System.out.print(path + ">");
                

        }
            
            
            
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            
        }
        
    }
    
}
