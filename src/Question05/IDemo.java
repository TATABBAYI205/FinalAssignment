package Question05;

/*
 1. Interface Definition :: Any service requirement specification is called Interface.
 2. From client point of view interface defines the set of services what is expecting.
 3. Inside interface every method is always abstract whether we are declaring or not
 	Hence interface considered as 100% pure abstract class.
 4. Whenever we are implementing an interface compulsorily for every method of that
	interface we should provide implementation otherwise we have to declare class as abstract
	class in that case child class is responsible to provide implementation for remaining methods.
 5. Whenever we are implementing an interface method compulsorily it should be
	declared as public otherwise it would result in CompileTime Error.

 */
public interface IDemo {
	public int add(int a, int b);
	
	public int sub(int a, int b);
	
	public int div(int a, int b);
	
	public int mul(int a, int b);
}
