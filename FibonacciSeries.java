
package com.bridgelabz.Logical_Programe;
import java.util.*;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many times you want to print the Fibonacci_Series : ");

		int times = sc.nextInt();
		int firstTerm = 0;
		int secondTerm = 1;



		System.out.print(firstTerm + " " + secondTerm);
		int nextTerm;
		for (int i = 1; i <= times; ++i) {

			nextTerm = firstTerm + secondTerm;
			System.out.print(" " + nextTerm);
			firstTerm = secondTerm;
	        secondTerm = nextTerm;
		}
	}
}
