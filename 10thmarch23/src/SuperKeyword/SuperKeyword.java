package SuperKeyword;

//public class SuperKeyword {
	class A {
		int no = 10;
		int a = 30;
	}

	class B extends A {
		int no = 20;

		int b = 40;

		void show(int n) {
			System.out.println(n); // 30
			System.out.println(this.no); // 20
			System.out.println(super.no); // 10
			System.out.println(a);
		}
	}

	class SuperKeyword {
		public static void main(String[] args) {
			B ob = new B();
			ob.show(30);
		}
	}



	/*
	 * -> The super keyword is a reference variable which is used to refer immediate
	 * parent class object -> Use of super keyword :- 1. super keyword can be used
	 * to refer the immediate parent class instance variable 2. super keyword can be
	 * used to invoke parent class method 3. super keyword is used to invoke parent
	 * class constructor -> super() should always be the first statement in
	 * constructor
	 */

