/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leapfrog.hamrograbber;

import com.Leapfrog.hamrograbber.util.Grabber;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
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

        try {

            Grabber grabber = new Grabber();
            String link = "http://hamrobazaar.com/c149-apparels-and-accessories-watches";
            String content = grabber.grab(link);
            StringBuilder data = new StringBuilder();
            String regEx = "Showing <b>1</b> to <b>20</b> of total <b>([0-9]+)</b>";
            Pattern pattern = Pattern.compile(regEx);
            Matcher matcher = pattern.matcher(content);
            if (matcher.find()) {
                System.out.println("total " + matcher.group(1));
                int total = Integer.parseInt(matcher.group(1));
                double pages = Math.ceil(total / 20);
                System.out.println("pages " + pages);
                int offset = 0;
                for (int i = 0; i <= pages; i++) {
                    String link1 = link + "&offset=" + offset;
                    content = grabber.grab(link1);
                    //System.out.println(content);
                    System.out.println("=========================================================");
                    regEx = "<div class=\"sold_div\"></div><a href=\"(.*?)\"> <img src='(.*?)_small.jpg'.*?<b>(.*?)</b>.*?<b>(.*?)</b>";
                    pattern = Pattern.compile(regEx);
                    matcher = pattern.matcher(content);
                    while(matcher.find()) {
                        System.out.println("TITLE: " + matcher.group(3));
                        System.out.println("PRICE: " + matcher.group(4));
                        System.out.println("LINK: http://hamrobazaar.com/" + matcher.group(1));
                        System.out.println("IMAGE URL: " + matcher.group(2));
                        String imgURL = matcher.group(2);
                        String [] tokens = imgURL.split("/");
                        String name = tokens[tokens.length-1]+".jpg";
                        System.out.println("img Name " +name);
                        String url = imgURL+".jpg";
                        System.out.println("URL parameter " + url);
                        grabber.downloadImage(url,name);
                        data.append("Title: ").append(matcher.group(3)).append("\r\n").append("Price: ").append(matcher.group(4)).append("\r\n").append("Product Link: ").append(matcher.group(1)).append("\r\n").append("Image URL: ").append(matcher.group(2)).append("\r\n\r\n\r\n");
                        FileWriter writer = new FileWriter("D:/leapfrog/Programs/hamrograbber/content.txt");
                        writer.write(data.toString());
                        writer.close();
                    }
                    offset += 20;
                }

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
