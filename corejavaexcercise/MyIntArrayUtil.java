package javatraining.corejavaexcercise;

import java.util.Arrays;
import java.util.Random;

public class MyIntArrayUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[10];
		Random random = new Random();
		for (int index = 0; index < array.length; index++) {
			array[index] = random.nextInt(100) + index;
		}

		System.out.println("Array before sorting\n" + Arrays.toString(array));

		Arrays.sort(array);

		System.out.println("Array after sorting\n" + Arrays.toString(array));
	}

}
