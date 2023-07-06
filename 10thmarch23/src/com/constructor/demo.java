package com.constructor;
//0 -argument constructor(programmer
//parametrized constructor(progranner)
//default constrcutor-(compiler)

public class demo {
	String name;
	 int age;
	 //0 argument
	 public demo() {
	     name="rahul";
	  age=20;
	  System.out.println(name+" "+age);
	 }
	 

	 //parameterized
	 public demo(String name2, int age2) {
	     name=name2;
	  age=age2;
	  System.out.println(name+" "+age);
	 }
	 
	 public static void main(String[] args) {
	  
	  
	 
	 }
	 
	 
	}


	//can we overload the constructor --yes
	//can we ovveride teh constructior-- -

	/*
	 * 
	 * A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
	 * Note that the constructor name must match the class name, and it cannot have
	 * a return type (like void).
	 * 
	 * Also note that the constructor is called when the object is created.
	 * 
	 * All classes have constructors by default: if you do not create a class
	 * constructor yourself, Java creates one for you. However, then you are not
	 * able to set initial values for object attributes.
	 * 
	 * 
	 */


