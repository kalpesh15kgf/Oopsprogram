package oops;
//single level Inheritance 
class Parent1{// parent 
	int multiplication(int a, int b,int c) {
		return a*b*c;
}
}
class Parent2{//child 1 of parent 1

}

class Parent3 extends Parent2{//child2
 void sum() {
}
}


public class TypesOFInheritance extends Parent1{
	public int sum(int a , int b)
	{
		return a+b;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TypesOFInheritance jk = new TypesOFInheritance();//object created
		System.out.println("Addition of Two No =  " +jk.sum(15, 45));
		System.out.println("Multiplication of three No =  " +jk.multiplication(3, 8, 1));
	}

}
