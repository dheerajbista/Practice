/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fileio.command;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author AT
 */
public class MkdirCommand extends DosCommand{

    @Override
    public void execute(String[] cmd) {
        
        new File(cmd[1]).mkdir();
    }
    
}
