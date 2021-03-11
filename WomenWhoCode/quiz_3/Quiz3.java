package womenWhoCode.quizzes;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		tempConversion();
	}

	private static void tempConversion() {
		Scanner input = new Scanner(System.in);
		String tempString = "Welcome to the Temperature Conversion!" + 
		                     " Enter F Temp: ";
		System.out.println(tempString);
		float fhar = input.nextFloat();
		int celsius = (int) getConversion(fhar);
		System.out.println(celsius);
	}

	private static float getConversion(float fhar) {
		float celsius = (float) ((float) (fhar - 32.0) * (5.0/9.0));
		return celsius;
	}

}
/*
OUTPUT
Welcome to the Temperature Conversion! Enter F Temp: 
32
0
*/
