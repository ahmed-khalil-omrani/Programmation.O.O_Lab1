package com.inventory;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("-------Good evening------ ");
        System.out.println("Please enter the first number:");
        x=sc.nextInt();
        System.out.println("Please enter the second number:");
        y=sc.nextInt();
        System.out.println("-------Calculate------ ");
        System.out.println(x+"+"+y+"="+(x+y));
        System.out.println(x+"-"+y+"="+(x-y));
        System.out.println(x+"*"+y+"="+(x*y));
        System.out.println(x+"%"+y+"="+(x/y));
        sc.close();


    }
}
