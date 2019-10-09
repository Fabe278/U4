/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.u4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabia
 */
public class Worker implements Runnable{
    List<Integer> zahlenarr = new ArrayList<>();
    int divider;
    int von;
    int bis;
    public Worker(int von, int bis,int divider , List<Integer> zahlenarr){
        this.von = von;
        this.bis = bis;
        this.zahlenarr = zahlenarr;
        this.divider = divider;
    }

    @Override
    public void run() {
        for(int i = von; i < bis; i++){
            if(zahlenarr.get(i)%divider==0){
                System.out.println(zahlenarr.get(i));
            }
        }
    }
    
}
