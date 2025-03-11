package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main mainInstance = new Main();
        mainInstance.test();
    }

    public void test() {
        // Single line comment
        /* Multi 
         * line
         * comment
         */
        System.out.println("Hello World!");
        long phone = 12345678900L;  
        System.out.println(phone);

        // String Concepts
        String name = "Preemal";  
        System.out.println(name.length());
        String firstName = "Preemal";
        String lastName = "Monis";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(firstName.charAt(0));
        String name1 = name.replace('P', 'S');
        String name2 = name.replace("Preemal", "Philipp");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name.substring(0, 3));
        
        //Arrays
        int[] courses = new int[3];
        courses[0] = 40;
        courses[1] =20;
        courses[2] =30;
        System.out.println(courses[0]);
        System.out.println(courses.length);
        Arrays.sort(courses);
        System.out.println(courses[0]);
        int[] marks = {80,82,85}; // 1D Array 
        System.out.println(marks[0]);
        System.out.println(marks.length);
        int[][] finalMarks = {{80,82,85},{90,92,95}}; //2D Array
        System.out.println(finalMarks[0][1]);
        System.out.println(finalMarks[1][0]);
        System.out.println(finalMarks.length);

        //Implicit Casting
        double price = 100.30;
        double newPrice = price + 20;
        System.out.println(newPrice);

        //Explicit Casting
        int val = 50;
        int newVal = val + (int)20.99; //It doesn't round off the value
        System.out.println(newVal);

        //Constants - using final keyword
        final float PI = 3.14f;
        System.out.println(PI);

        //Operators
        int a = 10;
        int b = 20;
        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        //Unary Operators
        int x = 1;
        System.out.println(++x); //2
        System.out.println(x++); //2
        System.out.println(x);   //3
        System.out.println(++x); //4

        //Maths class
        System.out.println(Math.max(5,8));
        System.out.println(Math.min(5,8));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.random()); // Always gives 0
        System.out.println((int)(Math.random()*100));

         //How to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        //String userName = sc.next(); //takes only tokens - used to print only one word
        String userName = sc.nextLine(); // takes the entire line
        System.out.println("Enter a statement: ");
        String statement = sc.nextLine();
        System.out.println("Hello " + userName);
        System.out.println("Enter your age: ");
        int userAge = sc.nextInt();
        System.out.println(userName+ " is " + userAge + " years old");
        sc.close(); 

        // Conditional Statements
        boolean isAdult = true;
        if(isAdult){
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }

        int age = 20;
        if(age > 18){
            System.out.println("Can Vote");
        } else {
            System.out.println("Cannot Vote");
        }
    }
}
