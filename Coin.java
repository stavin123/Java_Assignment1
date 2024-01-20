package Assigment1;

import java.util.Scanner;

class  Coin {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("enter the no. time coin has to be filled");
        n= s.nextInt();
        //double a=2^n;
        double toss;
        int head = 0,tail = 0;
        for(int i=1;i<=n;i++){
            toss = Math.floor(Math.random() * 10) % 2;
            if (toss == 1) {
                head++;
            }
            else {
                tail++;
            }
        }
        double headper=((double) head /n)*100;
        double tailper= ((double) tail/n*100);
        System.out.println(" head percentage ="+headper);
        System.out.println("tail percentage="+tailper);



    }
}