/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.u4.auf2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabia
 */
public class Worker implements Runnable{
    int von;
    int bis;
    int sum;
    public Worker(int von, int bis){
        this.von = von;
        this.bis = bis;
    }

    @Override
    public void run() {
        int leng = bis - von;
        sum = ((leng * leng) + leng)/2+von*leng;
        Main.getAll(sum);
    }
    
}
