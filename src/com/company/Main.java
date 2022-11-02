package com.company;

import java.util.Scanner;

public class Main {

    
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = input.nextInt();

        int i =0;
        double sum=0;
        while(i<=number){
            if(i%3==0 && i%4==0){
                sum+=i;
            }
            i++;
        }
        System.out.println("Summation of the numbers which are multiplies of 3 and 4. ");
        double average=sum/number;
        System.out.println("Average : "+ average);
    }
    }
}
