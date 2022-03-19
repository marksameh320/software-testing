//package com.company;
//import java.util.Scanner;
public class Main {
    public static boolean watermelon(int num) {
        return num!=2 && num%2== 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        System.out.print( watermelon(weight)? "YES" : "NO" );

    }
}
