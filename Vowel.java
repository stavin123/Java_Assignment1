package Assigment1;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a character");
        char letter=  input.next().charAt(0);
        if(letter=='A'||letter=='E'||letter=='I'||letter=='0'||letter =='U'||letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
            System.out.println("The given input is a vowel ");
        }
        else{
            System.out.println("The given input is a consonant");
        }

    }


}


