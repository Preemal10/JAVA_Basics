package com.example;

class Car {
    String name;
    int price;
    String type;

    public void carType() {
        System.out.println("The car type is "+this.type);
        System.out.println("The car name is "+this.name);
        System.out.println("The car price is "+this.price);
    }
}

// Concepts of Constructor explained using student Class
class Student {
    String name;
    int age;
    String course;

    public void studentDetails() {
        System.out.println("The student name is "+this.name);
        System.out.println("The student age is "+this.age);
        System.out.println("The student course is "+this.course);
    }

    // Non-Parameterized constructor
    Student(){
    }

    // Parameterized constructor
    Student(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Copy constructor
    Student(Student student2){
        this.name = student2.name;
        this.age = student2.age;
        this.course = student2.course;
    }   
}

//Concepts of Polymorphism explained using Method Overloading
class Calculation {
    public void sum(int a, int b){
        System.out.println("The sum of two numbers is "+(a+b));
    }

    public void sum(int a, int b, int c){
        System.out.println("The sum of three numbers is "+(a+b+c));
    }
}

//Concepts of Inheritance explained using Parent and Child Class
class Animals {
    String animalType;
}
class Dog extends Animals {
    public void animalSound(){
        System.out.println("The Dog breed is "+this.animalType);
        System.out.println("The " +this.animalType+ " barks");
    }
}

//Types of Inheritance
//Single Inheritance, Multilevel Inheritance, Hierarchical Inheritance, Hybrid Inheritance
class Shape {
    public void area(){
        System.out.println("Area of the shape is calculated");
    }
}
class Triangle extends Shape{
    public void area(int base, int height){
        System.out.println("The area of the triangle is "+(0.5*base*height));
    }
}
class ScaleneTriangle extends Triangle{
    public void area(int side1, int side2, int side3){
        System.out.println("The area of the scalene triangle is "+(side1+side2+side3));
    }
}
class Rectangle extends Shape{
    public void area(int length, int breadth){
        System.out.println("The area of the rectangle is "+(length*breadth));
    }
}   

//Concepts of Encapsulation explained using Getter and Setter methods
class Encapsulation {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}

//Concepts of Abstraction explained using Abstract Class
abstract class Fruits {
    public abstract void fruitType();
}
class Apple extends Fruits {
    public void fruitType(){
        System.out.println("The fruit is Apple");
    }
}

//Concepts of Interface
interface Flowers {
    void flowerType();
}
interface Plants {
    void plantType();
}
class Rose implements Flowers, Plants {
    public void flowerType(){
        System.out.println("The flower is Rose");
    }
    public void plantType(){
        System.out.println("The plant is Rose");
    }
}


public class OOPSConcepts {
    public static void main(String[] args){
        // Creating objects for class Car
        Car car1 = new Car();
        car1.name = "Audi";
        car1.price = 60000;
        car1.type = "Manual";
        car1.carType();
        System.out.println("-------------------------------------------------");

        // Parameterized constructor
        Student student1 = new Student("Sam", 20, "Java Programming");
        student1.studentDetails();

        // Non-Parameterized constructor
        Student student2 = new Student();
        student2.name = "Sean";
        student2.age = 22;
        student2.course = "Python Programming";
        //student2.studentDetails();

        System.out.println("-------------------------------------------------");
        // Copy constructor
        Student student3 = new Student(student2);
        student3.studentDetails();

        System.out.println("-------------------------------------------------");
        //Polymorphism - Method Overloading
        Calculation cal = new Calculation();
        cal.sum(10,20);
        cal.sum(10,20,30);

        System.out.println("-------------------------------------------------");
        //Inheritance
        Dog d = new Dog();
        d.animalType = "Husky";
        d.animalSound();

        System.out.println("-------------------------------------------------");
        //Types of Inheritance
        Shape shape = new Shape();
        shape.area();
        Triangle triangle = new Triangle();
        triangle.area(10,5);
        ScaleneTriangle scaleneTriangle = new ScaleneTriangle();
        scaleneTriangle.area(10,5,15);
        Rectangle rectangle = new Rectangle();
        rectangle.area(10,5);

        System.out.println("-------------------------------------------------");
        //Encapsulation
        Encapsulation encap = new Encapsulation();
        encap.setName("John");  
        encap.setAge(25);
        System.out.println("The name is "+encap.getName()); 
        System.out.println("The age is "+encap.getAge());

        System.out.println("-------------------------------------------------");
        //Abstraction   
        Apple apple = new Apple();
        apple.fruitType();

        System.out.println("-------------------------------------------------");
        //Interface
        Rose rose = new Rose();
        rose.flowerType();
        rose.plantType();
        

        
    }
    
}

