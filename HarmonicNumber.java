package Assigment1;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N to find the nth Harmonic no.");
        int n= sc.nextInt();
        double h = 0;
        for (int i = 1; i <= n; i++) {
             h= (double) 1 /i;

            }
        System.out.println("Nth harmonic no ="+h);
        }
    }

