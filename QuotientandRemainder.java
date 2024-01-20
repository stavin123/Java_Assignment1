package Assigment1;

import java.util.Scanner;

public class QuotientandRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend, divisor;
        System.out.println("Enter dividend and divisor");
        dividend= sc.nextInt();
        divisor= sc.nextInt();
        double quotient= (double) dividend /divisor;
        System.out.println("Quotient is:"+quotient);
        double remainder= dividend%divisor;
        System.out.println("Remainder is:"+remainder);
    }
}
