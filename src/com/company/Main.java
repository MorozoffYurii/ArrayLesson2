package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int mass[];
        mass = new int[30];
        int rand = r.nextInt(100);
        for(int j=0;j<mass.length;j++){
            mass[j] = rand;
            rand = r.nextInt(100);
            }
        for(int i=0;i<mass.length;i++){
            System.out.print(mass[i] + " ");
            }
        //------------------------------------------------------------------------------------//
        int l = scan.nextInt();
        int mass2[];
        mass2 = new int[l*l];
        for(int x=0;x<l;x++){
            for(int y=0;y<l;y++){
                if(x%2==1){
                    System.out.print("/n");
                }
            }
        }
}}


