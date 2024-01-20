package Assigment1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year to check if it is leap year or not");
        int year=sc.nextInt();
        int i=1,n = 0;
        while (year >= 99){
            int n1=year % 10;
            n=n+((i*10)*n1);
            i++;
            year=year/10;
        }
        if(n%4==0){
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }
    }
}
