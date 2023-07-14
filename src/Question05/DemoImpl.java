package Question05;

public class DemoImpl implements IDemo {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int div(int a, int b) {
		return a / b;
	}

	@Override
	public int mul(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		IDemo demo = new DemoImpl();
		System.out.println("Addition in implementation class DemoImpl :: "+demo.add(10, 20));
		System.out.println("Subtraction in implementation class DemoImpl :: "+demo.sub(20, 10));
		System.out.println("Division in implementation class DemoImpl :: "+demo.div(100, 5));
		System.out.println("Multiplication in implementation class DemoImpl :: "+demo.mul(3, 2));
	}

}
