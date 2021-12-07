package com.internshala.Assignment_1;

import java.util.*;

class Main {

    public static void main(String args[]) {

        int age;
        String name , bloodGroup , group;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Your Name");
        name = sc.nextLine();

        System.out.println("Enter Your Age");
        age = sc.nextInt();

        System.out.println("Enter Your Blood Group");
        bloodGroup = sc.next().toUpperCase();

        if (age >= 20) {
            group="RED";
        }
        else if (age > 15 && age < 20) {
            group = "BLUE";
        }
        else {
            group = "YELLOW ";
        }

        System.out.println("————————————————————");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Blood Group: "+bloodGroup);
        System.out.println("————————————————————");
        System.out.println("Your group is "+group);
        System.out.println("————————————————————");
    }
}

