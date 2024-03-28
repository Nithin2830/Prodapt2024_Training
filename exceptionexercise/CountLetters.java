package javatraining.exceptionexercise;
import java.util.Scanner;
import java.lang.Exception;

public class CountLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] counts=new int[26];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a single word (letters only, please): ");
		String word =scan.nextLine();
		scan.close();
		word=word.toUpperCase();
		try {
		for(int i=0;i<word.length();i++) {
			counts[word.charAt(i)-'A']++;
		}
		}catch(Exception e){
			System.out.println("Not a letter");
		}
		System.out.println();
		for(int i=0;i<counts.length;i++) {
			if(counts[i]!=0) {
				System.out.println((char)(i+'A')+" "+counts[i]);
			}
		}
	}

}
