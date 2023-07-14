package Question10;

import java.util.ArrayList;
import java.util.List;

/*
 10. Write a Java program that reads a set of integers from the user and stores them in a
	 List. The program should then find the second largest and second smallest elements
	 in the List.

 */

import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 8;
		
		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the element to the List at index "+i+ " :: ");
			int num = scan.nextInt();
			li.add(num);
		}
		System.out.println();
		
		System.out.println("List of numbers :: "+li);
		List<Integer> sortedList = li.stream().sorted((i1, i2)-> i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Sorted List :: "+sortedList);
		
		
		Integer max = sortedList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		
		Integer[] array = sortedList.stream().toArray(Integer[]::new);
		
		int maxIndexCount = 0;
		for(Integer i : array) {
			maxIndexCount++;
			if(max == i) {
				break;
			}
		}
		maxIndexCount--;
		int indexOfSecondMaxNumber = maxIndexCount-1;
		for(Integer i : array) {
			if(array[indexOfSecondMaxNumber] == i) {
				System.out.println("Second largest element in the list is :: "+array[indexOfSecondMaxNumber]);
			}
		}
		
		Integer min = sortedList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		
		int minIndexCount = 0;
		int indexOfSecondMinNumber = minIndexCount+1;
		for(Integer i : array) {
			if(array[indexOfSecondMinNumber] == i) {
				System.out.println("Second smallest element in the list is :: "+array[indexOfSecondMinNumber]);
			}
		}
		
		
	}
}
