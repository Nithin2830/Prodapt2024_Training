package javatraining.exceptionexercise;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		String keepGoing="y";
		Scanner scan= new Scanner(System.in);
		while (keepGoing.equals("y")||keepGoing.equals("Y")) {
			System.out.println("enter an integer");
			int val=scan.nextInt();
			System.out.println("Factorial(" + val + ") = "+ MathUtils.factorial(val));
			
			System.out.println("Another factotrial??(y/n) ");
			keepGoing=scan.next();
		}
		
	}
	
	public class MathUtils{
		public static int factorial(int n) {
			int fac=1;
			for(int i=n;i>0;i--)
				fac *= i;
			return fac;
		}
	}

}

