package javabasics;

public class StringOperation {
	
	//length-- starts with l
	//index --starts with 0
	
	public static void main(String[] args) {
		//non-primitive--user defined
		
		String a="Hello i love java";
		System.out.println(a);
		
		System.out.println(a.length());
		
		System.out.println(a.toUpperCase());
		
		System.out.println(a.toLowerCase());
		
		// Character at specific index-
		
		System.out.println(a.charAt(6));
		
		//escape character- \-backslash character
		
		//expected--hello i "love" java
		
		String h="hello i\"love\"java";
		System.out.println(h);

		
		//expected --i love \backslash character
		
		String e="i love \\ backslash character";
		System.out.println(e);
		
		// Expected- i love \\character
		
		String p="i love \\\\ character";
		System.out.println(p);
		
		// Expected- i love \@ character
		

		String t=" i love \\@ character";
		System.out.println(t);
		
	
		String x="hello";
		String y="Hello";
		
		
		System.out.println(x.contains(y));
		
		System .out.println(x.equalsIgnoreCase(y));
		
		String b="hello java";
		String c="hello";
		
		System.out.println(b.contains(c));
		
		String s=" hello i love java ";
		System.out.println(s.trim());
		
		//Concatenation-
		
		String ab="hello";
		String ac="java";
		
		System.out.println(ab+" "+ac);//This is first way
		
		System.out.println(ab.concat(" "+ac));//This is another way
		
		
		String v="90 java";
		System.out.println(v.replace("90","50"));
		
	}
	

}
