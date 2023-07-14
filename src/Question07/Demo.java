package Question07;

import java.util.Scanner;

/*
 7. Create a Java program that implements a binary search algorithm. The program
 	should accept user input for the target value and search for it in a sorted array.
 	The program should return the index of the target value if found or a message if not found.
 */

public class Demo {

	public static void main(String[] args) {
		int[] ar = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number to be searched :: ");
		int key = scan.nextInt();
		int low = 0;
		int high = ar.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == ar[mid]) {
				System.out.println("Number " + key + " Found at index :: " + mid);
				break;
			} else if (key < ar[mid]) {
				high = mid - 1;
			} else if (key > ar[mid]) {
				low = mid + 1;
			}
		}
		if (low > high) {
			System.out.println("Number not found");
		}
		scan.close();

	}

}
