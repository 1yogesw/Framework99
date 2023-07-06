package javabasics;

public class TypeCastingDemo {
	
	public static void main(String[] args) {

/*
  Widening Casting (automatically) - converting a smaller type to a larger type size--implicit type casting
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type----explicit type casting
double -> float -> long -> int -> char -> short -> byte
*/
  
		//widening
		int a=10;
		float b=a;
		
		System.out.println(b);//10.0
		
		byte c=20;
		double d=c;
		
		System.out.println(d);//20.0
		
		short s=32767;
		long l=s;
		
		System.out.println(l);
		
		short y=6789;
		float g=y;
		System.out.println(g);
		
		short y1=4567;
		double g1=y1;
		System.out.println(g1);
		
		char c3='B';
		int i3=c3;
		System.out.println(i3);
		
		//narrowing
		float f=10.88995677f;
		int z=(int)f; 
		
		System.out.println(z);
		
		
		double f1 =9.0;
		int v=(int)f1;
		
		System.out.println(v);
		
		long f2 =327656788;
		short i=(short)f2;
		System.out.println(i);
		
		long f3 =6488399;
		double n=(double)f3;
		System.out.println(n);
		
		double f4 =6574.6;
		short q =(short)f4;
		System.out.println(q);
		
		int i2=70;
		char c2=(char)i2;
		System.out.println(c2);
		
		byte b2=67;
		char c4=(char)b2;
		System.out.println(c4);
	}

}
