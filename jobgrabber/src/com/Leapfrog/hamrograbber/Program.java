/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leapfrog.hamrograbber;

import com.Leapfrog.hamrograbber.util.Grabber;
import com.Leapfrog.hamrograbber.util.matcher;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author AT
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String link = "", keyword = "";
        while (true) {
            int choice = 0;
            System.out.println("1.Mero Job");
            System.out.println("2.Jobs Nepal");
            System.out.print("Enter the Choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    link = "http://www.merojob.com/";
                    keyword = "<div class='hotjtext'><strong.*?>(.*?)</strong><.*?><li><a href='(.*?)'.*?>(.*?)</a></li>";
                    break;
                case 2:
                    link = "http://www.jobsnepal.com/";
                    keyword = "<a class=\"job-item\" id=\"job-[0-9]+\" href=\"(.*?)>\\s+(.*?)</a>.*?</td>.*?<a href=\"(.*?)\">\\s+(.*?)</a>";
                    break;

                default:
                    System.out.println("invalid choice");
                    System.exit(0);
            }
            try {
                outer:
                ;
                Grabber grabber = new Grabber();
                matcher m = new matcher();
                m.match(link, keyword);

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Do you want to quit [Y/N]");
            if (input.next().equalsIgnoreCase("y")) {
                System.exit(0);
            }
        }
    }
}
