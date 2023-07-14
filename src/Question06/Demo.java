package Question06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 6. Write a Java program that uses stream api to perform operations on a large data set,
	such as sorting or filtering the data.
 */
public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(22);
		
		
		System.out.println(al);
		
		//Filtering the even numbers
		List<Integer> evenNumberList = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		evenNumberList.forEach(System.out::println);
		
		System.out.println();
		
		//Sorting the elements
		List<Integer> sortedList = al.stream().sorted((i1,i2) -> i1.compareTo(i2)).collect(Collectors.toList());
		sortedList.forEach(i -> System.out.println(i));
	}

}
