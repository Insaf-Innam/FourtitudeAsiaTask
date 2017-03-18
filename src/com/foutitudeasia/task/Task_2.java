package com.foutitudeasia.task;

import java.util.ArrayList;

//Task 2
//Task 2 (Basic)

public class Task_2 {

	public static void main(String[] args) {
		String number = "543215432154321";
		int sumA = figNum(number, 0).stream().map(a -> a * 3).mapToInt(i -> i).sum();
		int sumB = figNum(number, 1).stream().map(b -> b * 5).mapToInt(i -> i).sum();
		int sumC = figNum(number, 2).stream().map(b -> b * 7).mapToInt(i -> i).sum();
		int s = sumA + sumB + sumC;
		System.out.println("check digit - " + sumDigits(s));
		System.out.println("genarated reference number - " + number + sumDigits(s));
	}

	private static ArrayList<Integer> figNum(String number, int start) {
		ArrayList<Integer> numLst = new ArrayList<>();
		for (int i = start; i < number.toCharArray().length; i += 3) {
			numLst.add(Integer.parseInt(String.valueOf(number.toCharArray()[i])));
		}
		return numLst;
	}

	public static long sumDigits(long i) {
		return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
	}

}
