package Question08;

import java.util.List;
import java.util.stream.Collectors;

/*
 8. Write a Java program that creates two threads. The first thread should print even
	numbers between 1 and 10, and the second thread should print odd numbers between 1 and 10.
 */
class MyRunnable1 implements Runnable {
	
	@Override
	public void run() {
		List<Integer> l = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenNumbers = l.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println("Even numbers in the list");
		System.out.println("MyRunnable1 Thread :: "+Thread.currentThread().getName());
		evenNumbers.forEach(System.out::println);
		System.out.println();
	}
}

class MyRunnable2 implements Runnable {
	@Override
	public void run() {
		List<Integer> l = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> oddNumbers = l.stream().filter(i -> i%2!=0).collect(Collectors.toList());
		System.out.println("Odd numbers in the list");
		System.out.println("MyRunnable2 Thread :: "+Thread.currentThread().getName());
		oddNumbers.forEach(System.out::println);
	}
}

public class Test {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 r1 = new MyRunnable1();
		Thread t1 = new Thread(r1);
		t1.start();
		
		MyRunnable2 r2 = new MyRunnable2();
		Thread t2 = new Thread(r2);
		t2.sleep(2000);
		t2.start();
		
		
	}

}
