package com.bridgelabz.Logical_Programe;

import java.util.*;

public class StopWatch{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Press 1 to start the clock : ");
		double start = sc.nextDouble();
		start = System.currentTimeMillis();
		System.out.println("Start Time : " + start);

		System.out.print("Press 0 to stop the clock : ");
		double stop = sc.nextDouble();
		stop = System.currentTimeMillis();
		System.out.println("End Time " + stop);

		double elapsed_time = (stop - start) / 1000;
		System.out.println("\nElapsed time is " + elapsed_time + "seconds");
		sc.close();
	}
}

