package Question09;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Random;

/*
 9. Write a Java program that implements a producer-consumer model using
	multithreading. The program should have a producer thread that generates random
	numbers and adds them to a queue, and a consumer thread that reads numbers
	from the queue and calculates their sum. The program should use synchronization to
	ensure that the queue is accessed by only one thread at a time.
 */
class Data {
	ArrayDeque<Integer> q = new ArrayDeque<Integer>();
	boolean valueAdd = false;
	
	public synchronized void add(ArrayDeque<Integer> ad) {
		while(valueAdd) {
			try { wait();}catch(Exception e) {}
		}
		this.q.addAll(ad);
		valueAdd = true;
		notify();//Notifies to the consumer thread
	}
	
	public synchronized void getData(){
		
		while(!valueAdd) {
			try { wait();}catch(Exception e) {}
		}
		
		Iterator<Integer> itr = q.iterator();
		int sum = 0;
		while (itr.hasNext()) {
			int num = itr.next();
			sum += num;
		}
		System.out.println();
		System.out.println("Sum of Queue data is :: " + sum);
		valueAdd = false;
		notify();//Notifies the producer thread
		
	}
}

class Producer implements Runnable {

	Data d;

	Producer(Data d) {
		this.d = d;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	@Override
	public synchronized void run() {
		Random random = new Random();
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		for (int i = 0; i <= 5; i++) {
			int num1 = random.nextInt(10);
			System.out.print(num1 + " ");
			ad.add(num1);
		}
		System.out.println();
		d.add(ad);
		System.out.println("The Queue is :: "+d.q);
	}

}

class Consumer implements Runnable {

	Data d;

	Consumer(Data d) throws InterruptedException {
		this.d = d;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	@Override
	public synchronized void run() {
		d.getData();
	}

}

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Data d = new Data();
		new Producer(d);
		new Consumer(d);
	}

}
