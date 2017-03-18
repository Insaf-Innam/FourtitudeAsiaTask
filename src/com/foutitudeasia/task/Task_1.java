package com.foutitudeasia.task;

//Task 1
//Task 1 (Basic)

public class Task_1 {

	public static void main(String[] args) {
		int loan = 500000;
		double rate = 4.65;
		double A = (0.90 * loan) * ((((rate / 100) / 12) * Math.pow(1 + ((rate / 100) / 12), (30 * 12)))
				/ (Math.pow(1 + ((rate / 100) / 12), (30 * 12)) - 1));
		System.out.println(A);
	}

}
