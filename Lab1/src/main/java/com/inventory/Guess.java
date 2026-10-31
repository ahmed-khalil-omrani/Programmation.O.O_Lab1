package com.inventory;

import java.net.SocketOption;
import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int n = 0, g;
        int x=r.nextInt(100)+1;
        do{
            System.out.println("enter guess");
            g=sc.nextInt();
            n++;
            if(g<x){
                System.out.println("too low");
            }
            else if(g>x){
                System.out.println("too high");
            }else{
                System.out.println("correct");
            }
        }while(g!=x);
        System.out.println("you have "+n+" attempts");
    }
}
