package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    System.out.println("Enter number:");
        int number = input.nextInt();
       /* for(int i = 1; i < number; i++){
            if (i%2==0){
                System.out.println(i+" is even");
            }

        }
*/
/*      int i =1;
        while(i<=number){
            if(i%2==0){
                System.out.println(i+" is even");
            }
            i++;
        }
        */
        int i =0;
        int sum=0;
        while(i<=number){
            if(i%3==0 && i%4==0){
                sum+=i;
            }
            i++;
        }
        System.out.println("Summation of the numbers which are multiplies of 3 and 4. ");

        System.out.println("Sum : "+ sum);
    }
}
