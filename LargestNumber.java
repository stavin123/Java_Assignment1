package Assigment1;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 no.s");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(a+" is greatest no.");

            }

        } else if (b>c) {
            System.out.println(b+" is greatest no.");

        }
        else {
            System.out.println(c+" is greatest no.");
        }

    }

}
