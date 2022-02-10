package oops;

public class InheritanceUsedOverridingPoly extends A {
	int a=2;// declaring+intialization
	int b =3;
	int c;
	
	void sum() {
		c=a+b;
		System.out.println("Result: " + c);
	}
		void multiplication(int a, double b) {//parent
			System.out.println("Parent Result of Multiplication: " +(a*b));
			System.out.println("Hello Child");
		}
		void display() {
			System.out.println("Hello CHild");
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceUsedOverridingPoly kj = new InheritanceUsedOverridingPoly();
		kj.sum();
		kj.multiplication(3, 2.5);
		A a = new A();
		a.display();
		kj.display();
		//iufopd.multiplication(3, 4.0);// declare in class A which is parent class

	}

}
