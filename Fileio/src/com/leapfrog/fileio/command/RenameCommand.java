/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fileio.command;

import java.io.File;

/**
 *
 * @author AT
 */
public class RenameCommand extends DosCommand{

    @Override
    public void execute(String[] cmd ) {
        if (cmd.length>2){
            
        
        new File(cmd[1]).renameTo(new File(cmd[2]));
        }
        else {
            System.out.println("Not enough parameter");
        }
    }
 
    
}
