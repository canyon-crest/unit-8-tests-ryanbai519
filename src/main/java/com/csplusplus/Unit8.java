package com.csplusplus;

public class Unit8 {

    // 1. Method to calculate the sum of all elements in a 2D array
    // Instructions: Traverse the 2D array and calculate the sum of all elements.
    public static int sumOfElements(int[][] array) {
        // TODO: Implement this method
    	int totalSum = 0;
    	for (int[] rowArr : array) {
    		for (int val : rowArr) {
    			totalSum += val;
    		}
    	}
        return totalSum;  // Placeholder return value
    }

    // 2. Method to count how many times a specific number appears in a 2D array
    // Instructions: Traverse the 2D array and count the number of times a specified value appears.
    public static int countOccurrences(int[][] array, int value) {
        // TODO: Implement this method
    	int count = 0;
    	for (int[] rowArr : array) {
    		for (int val : rowArr) {
    			if (val == value) {
    				count++;
    			}
    		}
    	}
        return count;  // Placeholder return value
    }

    // 3. Method to find the maximum element in a 2D array
    // Instructions: Traverse the 2D array and find the maximum element.
    public static int findMax(int[][] array) {
        // TODO: Implement this method
    	int maxVal = Integer.MIN_VALUE;
    	for (int[] rowArr : array) {
    		for (int val : rowArr) {
    			if (val > maxVal) {
    				maxVal = val;
    			}
    		}
    	}
        return maxVal;  // Placeholder return value
    }

    // 4. Method to reverse the rows of the 2D array
    // Instructions: Reverse the rows of the 2D array (e.g., the first row becomes the last, etc.).
    public static void reverseRows(int[][] array) {
        // TODO: Implement this method
    	for (int rowIndex = 0; rowIndex < array.length/2; rowIndex++) {
    		int[] temp = array[rowIndex];
    		array[rowIndex] = array[array.length - 1 - rowIndex];
    		array[array.length - 1 - rowIndex] = temp;
    	}
    }

    // 5. Method to transpose a 2D array (swap rows and columns)
    // Instructions: Create and return a new 2D array that is the transpose of the input array.
    public static int[][] transpose(int[][] array) {
        // TODO: Implement this method
    	int[][] transposedArr = new int[array[0].length][array.length];
    	for (int rowIndex = 0; rowIndex < array.length; rowIndex++) {
    		for (int columnIndex = 0; columnIndex < array[0].length; columnIndex++) {
    			transposedArr[columnIndex][rowIndex] = array[rowIndex][columnIndex];
    		}
    	}
//    	for (int rowIndex = 0; rowIndex <= array.length/2; rowIndex++) {
//    		for (int columnIndex = 0; columnIndex < array[0].length/2; columnIndex++) {
//    			transposedArr[transposedArr.length - 1 - rowIndex][transposedArr[0].length - 1 - columnIndex] = 
//    			array[rowIndex][columnIndex];
//    		}
//    	}
    	
        return transposedArr;  // Placeholder return value
    }

    // 6. Method to fill a 2D array with random integers
    // Instructions: Create a 2D array of size numRows x numCols and fill it with random integers between min and max.
    public static int[][] fillWithRandom(int min, int max, int numRows, int numCols) {
        // TODO: Implement this method
    	int[][] returnedArr = new int[numRows][numCols];
    	for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
    		for (int columnIndex = 0; columnIndex < numCols; columnIndex++) {
    			int randNum = (int) (Math.random() * (max - min)) + min;
    			returnedArr[rowIndex][columnIndex] = randNum;
    		}
    	}
        return returnedArr;  // Placeholder return value
    }
}