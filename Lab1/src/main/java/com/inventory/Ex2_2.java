package com.inventory;

import java.util.Scanner;

public class Ex2_2 {
    public static void main(String[] args){
        double width,high,perimeter,area;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter width rectangle");
        width=sc.nextDouble();
        System.out.println("enter high rectangle");
        high=sc.nextDouble();

        perimeter=(width+high)*2;
        area=width*high;
        System.out.println("perimeter="+perimeter);
        System.out.println("area="+area);

        sc.close();

    }
}
