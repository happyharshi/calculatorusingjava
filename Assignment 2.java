package com.internshala.Assignment_2;

import java.util.*;

class Main {

    public static void calculateTax(long income , String name) {

        long tax;

        if(income >= 300000) {

            tax = (long)(0.2*income);

        }
        else if(income >= 100000 && income < 300000) {

            tax = (long)(0.1*income);

        }
        else {

            tax = 0L;

        }

        System.out.println(name+" : \u20B9 "+tax);

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner (System.in);

        System.out.println(" Tax Calculator App");
        System.out.println("----- WELCOME ------ ");
        System.out.println();

        System.out.println("Enter total person count:");
        int count = sc.nextInt();
        System.out.println();

        String[] name = new String[count];
        long[] annualIncome = new long[count];

        for(int i = 0 ; i < count ; i++) {

            System.out.println("Enter name "+(i+1)+" :");
            name[i] = sc.next();

            System.out.println("Enter "+name[i]+"'s Annual Income:");
            annualIncome[i] = sc.nextLong();

            System.out.println();

        }

        System.out.println(" Names with liable taxes");
        System.out.println("—————————————————————————");

        for(int i = 0 ; i<count ; i++) {

            calculateTax(annualIncome[i] , name[i]);

        }

    }

}