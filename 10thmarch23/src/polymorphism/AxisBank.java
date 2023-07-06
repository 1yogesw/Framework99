package polymorphism;

public class AxisBank extends Bank {

	// overrided method
	

	public void checkBalance() {
		System.out.println("balance is 2000");
	}

	public void method2() {

		System.out.println("i am from axis bank");

	}

	public static void main(String[] args) {

		// child reference child object
		AxisBank obj = new AxisBank();
		obj.checkBalance(); // child override method
		obj.method2(); // child
		obj.method1(); // parent

		// parent ref parent object
		Bank obj1 = new Bank(); // This will call only parent methods
		obj1.checkBalance(); // 1000
		obj1.method1(); // i am from bank
		
		//parent ref  child object  // upcasting
		  Bank obj2=new AxisBank(); //This will call only parent method except oveerrided method(Child override method will get called)
		   
		     obj2.method1();
		     obj2.checkBalance();
		      
		    //child ref and parent object   //downcasting-
		   // AxisBank obj3=new Bank()

	}

}