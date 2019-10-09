/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.u4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fabia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Main main = new Main();
        List<Integer> zahlenarr = new ArrayList<>();
        zahlenarr = main.readCSVFile("numbers.csv");
        
        System.out.print("chunks>");
        int chunks = s.nextInt();
        System.out.print("divider>");
        int divider = s.nextInt();
        int lengthList = zahlenarr.size()/chunks;
        
////        for(int i)
    }
    
    public List<Integer> readCSVFile(String path){
        List<Integer> zahlenarr = new ArrayList<>();
        try(FileReader r = new FileReader(path); BufferedReader br = new BufferedReader(r)){
            String line = br.readLine();
            while(line != null){
                String[] parts = line.split(":");
                for (String part : parts) {
                    try{
                        zahlenarr.add(Integer.parseInt(part));
                    }catch(Exception e){
                        
                    }
                }
                line = br.readLine();
            }
        }
        catch(Exception e){
            
        }
        return zahlenarr;
    }
    
}
