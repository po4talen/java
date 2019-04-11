package com.igor.sandbox;

public class MyFirstProgram {

 public static void main(String[] args){
	hello("world");
	hello("user");
	hello("Igor");


	Square s = new Square(5);
    System.out.println("Площа квадрата зі стороною " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
              System.out.println("Площа прямокутника зі сторонами " + r.a + " та " + r.b + " = " + area(r));
 }

 public static void hello(String somebody){
    System.out.println("Hello " + somebody + "!");
 }



 public static double area (Rectangle r){
     return r.a * r.b;
 }
}