package Question05;

/*
1. Abstraction Definition :: Hiding actual implementation and showing method signature only.
2. Abstract methods :: Such a method only method signature are there body and implementation are not there.
3. In class any one method is abstract mandatory to declare class abstract.
4. If all the methods are abstract then its pure abstraction otherwise partial abstraction.
5. Abstract class can have abstract methods and it can also have concrete methods.
6. Abstract can be applied to method and class level it not applicable to variable.
7. In child class either implement the body of abstract methods of parent or write class as abstract.
8. We can create reference of abstract class but we can not create object of abstract class.
9. constructor cannot made abstract because it has super() inbuilt method body.
10. We cannot create abstract class final.
11. Abstract class is incomplete class its child class completes it.
12. Abstract method and final keyword its illegal combination.

*/

abstract class Launch {

	abstract public int add(int a, int b);

	abstract public int sub(int a, int b);

	public int div(int a, int b) {
		return a / b;
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
}

class Launch2 extends Launch{

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}
	 
}

public class LaunchAbstract {
	public static void main(String[] args) {
		Launch l = new Launch2();
		System.out.println("Addition in child class of abstract class :: "+l.add(10, 20));
		System.out.println("Subtraction in child class of abstract class :: "+l.sub(20, 10));
		System.out.println("Division in child class of abstract class :: "+l.div(100, 10));
		System.out.println("Multiplication in child class of abstract class :: "+l.mul(4, 5));
	}

}
