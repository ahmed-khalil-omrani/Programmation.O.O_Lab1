package com.inventory;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex2_1 {
    public static void main(String[] args) {
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