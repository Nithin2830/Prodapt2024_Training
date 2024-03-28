package javatraining.exceptionexercise;

import java.util.Scanner;

public class ParaeInts {

	public static void main(String[] args) {
		int val, sum = 0;
		Scanner scan = new Scanner(System.in);
//		String line;
		scan.close();

		System.out.println("enter a line of text");
		Scanner scanLine = new Scanner(scan.nextLine());
		

		try {
			while (scanLine.hasNext()) {
				val = Integer.parseInt(scanLine.next());
				sum += val;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("The sum of the integers on this is " + sum);
	}

}
