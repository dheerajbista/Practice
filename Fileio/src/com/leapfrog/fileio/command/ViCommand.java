/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fileio.command;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author AT
 */
public class ViCommand extends DosCommand {

    @Override
    public void execute(String[] cmd) {

        Scanner input = new Scanner(System.in);
        try {
            String [] s;
            FileWriter writer = new FileWriter(cmd[1]);
            writer.write(input.next());
            writer.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
