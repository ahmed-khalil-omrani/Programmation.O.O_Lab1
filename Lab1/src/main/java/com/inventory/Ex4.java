package com.inventory;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        double a,b,x;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a");
        a=sc.nextByte();
        System.out.println("enter b");
        b=sc.nextByte();
        x=a;
        a=b;
        b=x;
        System.out.println("print a="+a+"\nprint b="+b);
        sc.close();
    }   
}
