/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.u4.auf2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author fabia
 */
public class Main {

    static int sumAll;

    public static void main(String[] args) throws InterruptedException {

        Scanner s = new Scanner(System.in);
        System.out.print("n>");
        int number = s.nextInt();

        int chunks = Math.round(number / 100);
        int von = 0;
        int bis = 100;
        ExecutorService exec = Executors.newFixedThreadPool(chunks);

        for (int i = 0; i <= chunks; i++) {
            if (von + 100 > number) {
                Runnable worker = new Worker(von, number);
                exec.execute(worker);
                von = von + 100;
                bis = bis + 100;
            } else {
                Runnable worker = new Worker(von, bis);
                exec.execute(worker);
                von = von + 100;
                bis = bis + 100;
            }
        }

        exec.shutdown();
        exec.awaitTermination(1, TimeUnit.DAYS);
        System.out.println(sumAll);
    }

    public static int getAll(int wert) {
        return sumAll = sumAll + wert;
    }
}
