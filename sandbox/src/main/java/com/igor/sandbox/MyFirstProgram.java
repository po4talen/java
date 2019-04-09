package com.igor.sandbox;

public class MyFirstProgram {

 public static void main(String[] args){
	hello("world");
	hello("user");
	hello("Igor");
	double l = 5;
     System.out.println("Площа квадрата зі стороною " + l + " = " + area(l));

     double a = 4;
     double b = 6;
     System.out.println("Площа прямокутника зі сторонами " + a + " та " + b + " = " + area(a, b));
 }

 public static void hello(String somebody){
    System.out.println("Hello " + somebody + "!");
 }

 public static double area (double len){
    return len * len;
 }

 public static double area (double a, double b){
     return a * b;
 }
}