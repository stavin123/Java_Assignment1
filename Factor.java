package Assigment1;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no to find Factors");
        int n=sc.nextInt();
        System.out.println("factors are:2");
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }

    }
}
