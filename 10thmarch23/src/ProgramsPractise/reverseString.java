package ProgramsPractise;

public class reverseString {
	public static void main(String[] args) {

	  String s="prathemesh";
	  
	  //s.length=9
	  
	  String temp1="";
	  
	  for(int i=s.length()-1;i>=0;i--) {
		  
		temp1=temp1+s.charAt(i) ;
		//temp1=""+h=h
		//temp1=h+s=hs
		//temp1=hs+e=hse
		//temp1=hse+m=hsem
		//temp1=hsem+e=hseme
		//temp1=hseme+h=hsemeh
		//temp1=hsemeh+t=hsemeht
		//temp1=hsemeht+a=hsemehta
		//temp1=hsemehta+r=hsemehtar
		//temp1=hsemehtar+p=phsemehtar
	  }
	  
	  System.out.println(temp1);
		
		
		
	  }

}
