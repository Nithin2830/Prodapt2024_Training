package javatraining.corejavaexcercise;

public class RecursiveSmallestIntegers {

    public static int recursiveMin(int[] array, int index) {
        if (index == array.length) {
            return Integer.MAX_VALUE;
        } else {
            return Math.min(array[index], recursiveMin(array, index + 1));
        }
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        int result = recursiveMin(inputArray, 0);
        System.out.println("The smallest value in the array is : " + result);
    }
}