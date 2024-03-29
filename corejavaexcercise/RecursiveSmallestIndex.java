package javatraining.corejavaexcercise;



public class RecursiveSmallestIndex {

	public static int recursiveMinIndex(int[] array, int index) {
		if (index == array.length) {
			return -1;
		} else {

			int minIndex = recursiveMinIndex(array, index + 1);
			if (minIndex == -1 || array[index] < array[minIndex]) {
				return index;
			} else {
				return minIndex;
			}
		}
	}

	public static void main(String[] args) {
		int[] inputArray = { 2, 3, 5, 4, 1 };
		int resultIndex = recursiveMinIndex(inputArray, 0);
		System.out.println("The index of the smallest value in the array is : " + resultIndex );

	}

}
