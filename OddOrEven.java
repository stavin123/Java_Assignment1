package Assigment1;

import java.util.Scanner;

public class OddOrEven
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n= sc.nextInt();
        System.out.println("the number you entered is :"+n);
        if(n%2==0 ){
            System.out.println("the num is even");
        }
        else{
            System.out.println("the num is odd");
        }
    }
}
