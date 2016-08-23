/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leapfrog.hamrograbber.util;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author AT
 */
public class matcher {

    public String match(String link, String regEx) throws IOException {

        Grabber grabber = new Grabber();
        String content = grabber.grab(link);
        // System.out.println(content);

        StringBuilder data = new StringBuilder();

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("match 1 :" + matcher.group(1));
            System.out.println("match 2 :" + matcher.group(2));
            System.out.println("match 3 :" + matcher.group(3));
            System.out.println("=================================");

        }
        return (null);
    }
}
