package com.constructor;

public class defaultconstructor {
	 int a1;
	 String b;
	 boolean c;
	 
	 public static void main(String[] args) {
	  
	  defaultconstructor obj=new defaultconstructor ();
	  
	  System.out.println(obj.a1);
	  System.out.println(obj.b);
	  System.out.println(obj.c);
	   
	 }
	 
}



	//*1. Default constructors :-

	 //-> Whenever we dont create any constructor in 
	//class, then compiler will always create a constructor 
	//which is known as default constructor
	//-> Default constructors are used to provide the 
	//default values to the objects like 0, null etc 
	//depending on the datatype.

	//-> Note : If programmer creates any one 
	//constructor then compiler will not generate default 
	//constructor
