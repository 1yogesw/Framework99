package javabasics;

public class OperatorsDemo {
 
 
public static void main(String[] args) {
  
  //Arithmetic -- +, -,/,*,increment and decrement
  //Assignment
  //comparison
  //logical
  
  
  int a=10;
  int b=20;
  System.out.println(a+b);
  
  int c=a+b;
  System.out.println(c+" "+"hello");
  
  System.out.println(b-a);
  
  int d=b-a;
  
  System.out.println(d+" "+"hello");
  
  int e=a*b;
  
  System.out.println(a*b);
  
  System.out.println(e+" "+"hello");
  
  int k=30;
  int j=7;
  
  System.out.println(k/j);
  
  double f=(double)k/(double)j;
  
  System.out.println(f);
  
  
  //increment and decrement--
  
  //increment-++--1
  //preincrement-
  
  int x=5;
  System.out.println(++x);//6
  System.out.println(x);//6
  
  //postincrement
  int y=5;
  System.out.println(y++);//5
  System.out.println(y);//6
  
  
  //decrement--
  
 //predecrement
  int z=5;
  System.out.println(--z);//4
   System.out.println(z);//4
   
   //postdecrement
   int p=5;
   System.out.println(p--);
   System.out.println(p);
   
  // postincrement
   int g=5;
   System.out.println(g++);
   System.out.println(g);
   
   int l=5;
   System.out.println(++l+l);//6+6=12
   System.out.println(l);//6
   
   
   int s=5;
   System.out.println(s+++s);//5+6=11
   System.out.println(s);//6
   
   int u=5;
   System.out.println(--u-u);//0
   System.out.println(u);//4
   
   int ab=5;
   System.out.println(ab---ab);//1
   System.out.println(ab);//4
   
   int cd=39;
   int dc=10;
   System.out.println(cd%dc);//9
   
   //Assignment operator-=
   
   //comparison operator-->,<,>=,<=,==,!=
   
   int i=10;
   
   System.out.println(i<10);//false
   System.out.println(i>10);//false
   System.out.println(i<=10);//true
   System.out.println(i>=10);//true
   System.out.println(i==10);//true
   System.out.println(i!=10);//false
   
 // logical
   
   //AND  //OR  //NOT
   
   
  //AND-- if both the conditions are true then it will return true
   //OR-  if either one of the condition is true then it will return true
   //Not- it will reveres the result
   
   int t=10;
   System.out.println(t<10 && t<=20);//false
   System.out.println(t>10 || t<=20);//true
   System.out.println(!(t<10 || t>20));//true
   
   
   
  
  
  
  
 
  
  
  
  
 }

}
	


	

	
	
	
	
	
	
	
	
	
	
	
	
	


