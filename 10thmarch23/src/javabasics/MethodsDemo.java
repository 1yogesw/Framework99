package javabasics;

public class MethodsDemo {
	
	 // We have created method1 --Non-static method
	 public void method1() {
	  System.out.println("hello");
	 
	 }

	 // We have created method2 --non-static method
	 public void method2() {
	  System.out.println("hello2");
	 }

	 // static method
	 public static void method3() {
	  System.out.println("this is static method");
	 }

	 // parameterized method

	 // rahul 30
	 public void method4(String name, int age) {
	  System.out.println(name + " " + age);
	 }
	 
	 
	 

	 // parameterized method static method

	 // rahul 30
	 public static  void addition(int a, int b) {
	  System.out.println(a+b);
	 }
	 
	 
	 //method with int return type-
	 
	 
	 public int age() {
	  int a=5;
	  return a;
	  
	 }
	 
	 public int age2() {
	 
	  int b=5;
	  return b;
	  
	 }
	 
	 public void method5() {
	  
	  
	     addition(age(),20);
	     
	     addition(age2(),6);
	     
	  
	 }
	 
	 
	 

	 public static void main(String[] args) {

	  // we have to call the method1
	  // To call the method follow below steps-
	  // 1. create the object of class- classname obj=new classname();
	  // 2. then call the method with objectname.methodname

	  MethodsDemo obj = new MethodsDemo();
	  obj.method1(); // calling the method1 --This is non-static method so need of object to call the
	      // method
	  obj.method2(); // calling the methood2

	  method3();// This is static method so no need to of object to call the method

	  obj.method4("rahul", 30); //
	  addition(45, 56);
	 

	  System.out.println(obj.age());
	  

	 }

	}


