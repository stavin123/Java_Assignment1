package Assigment1;

import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {
        System.out.println("Enter 2 no.s that has to be  swapped");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("before swapping:"+"a="+a+" "+"b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping:"+"a="+a+" "+"b="+b);
    }
}
