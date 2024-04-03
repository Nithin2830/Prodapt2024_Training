package javatraining.collectionsandgenericsassignment;

import java.util.Scanner;

public class SwappingListPos {
	public static <T> T[] swap(T[] list, int firstPos, int secondPos) {
		if (firstPos < 0 && list.length < 0 || secondPos < 0 && list.length < 0) {
			throw new IndexOutOfBoundsException("Index out of bound");
		}
		T temp = list[firstPos];
		list[secondPos] = list[firstPos];
		list[secondPos] = temp;
		return list;

	}
	
	public static <T> void printList(T[] list) {
		for(T item:list) {
			System.out.println(item + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer listcontent[] = { 1, 2, 3, 4, 5, 6 };
		Scanner fristpos = new Scanner(System.in);
		System.out.println("Enter the pos1 to change");
		int fs = fristpos.nextInt();
		
		
		Scanner secondpos = new Scanner(System.in);
		System.out.println("Enter the pos2 to change");
		int sp=secondpos.nextInt();
		fristpos.close();
		secondpos.close();

		printList(SwappingListPos.swap(listcontent,fs,sp));

	}
}
