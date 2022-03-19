//package com.company;
import java.util.Scanner;
public class Main {
    public static boolean equal(int tot_fx,int tot_fy,int tot_fz){

        if (tot_fx==0 && tot_fy==0 && tot_fz==0){
            return true;
        }
        else{
            return false;
        }


    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int x=0,y=0,z=0;
        while(n>0){
            x=x+ inp.nextInt();
            y=y+ inp.nextInt();
            z=z+ inp.nextInt();
            n=n-1;
        }
        if(equal(x,y,z)==true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
