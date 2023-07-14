package Question02;

/* Question02
 * 
 Write a Java program to invoke parent class constructor from a child class. Create
 Child class object and parent class constructor must be invoked. Demonstrate by
 writing a program. Also explain key points about Constructor
*/

//Key point about constructor 
 
/*
1. Definition :: Specialized method which name is same as class name is called constructor.
2. Constructor construct the object. 
3. Constructor can have parameters.
4. Constructor do not have return type.
5. When object created constructor getting called automatically.
6. Same constructor with same parameter not allowed.
7. Whenever there is call to constructor and if programmer not added constructor then JVM will 
   include zero parameter constructor automatically 
8. If programmer included parameterized constructor and if zero parameter constructor required 
   in program in that case JVM not include automatically programmer need to add explicitly
9. In constructor if you write or not there should be super() at first line of constructor it calls 
   zero parameterized constructor of parent class
10. In constructor in first line we can mention this() also which calls constructor of same class
11. In constructor super() and this() should not present at a time, only one should present in first line only.
*/

class Parent {
	public Parent() {
		System.out.println("Parent class zero param constructor");
	}

	public Parent(int x, int y) {
		System.out.println("Parent class two param constructor");
		int res = x + y;
		System.out.println("Addition from Parent class parameterized constructor :: "+ res);
	}
}

class Child extends Parent {
	public Child() {
		System.out.println("Child class zero param constructor");
	}

	public Child(int a, int b) {
		super(a, b);
		System.out.println("Child class two param constructor");
	}
}

public class Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Child child = new Child();
		Child child2 = new Child(10, 20);
	}

}
