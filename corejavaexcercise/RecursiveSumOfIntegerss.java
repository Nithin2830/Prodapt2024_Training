package javatraining.corejavaexcercise;


public class RecursiveSumOfIntegerss {

    public static int recursiveSum(int[] array, int index) {
        if (index == array.length) {
            return 0;
        } else {
            return array[index] + recursiveSum(array, index + 1);
        }
    }

    public static void main(String[] args) {
        int[] inputArray = {2, 2, 2, 2, 2};
        int result = recursiveSum(inputArray, 0);
        System.out.println("Sum of elements in the array  is : " + result );
    }
}
