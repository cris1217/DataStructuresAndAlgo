/*
 * Bubble sort is the one of the sorting algorithm.
 */
package com.datastructures.sorting;

/*
 * @initialArray This is the array to be sorted.
 * @sortedArray This is the array after sorting.
 */
public class BubbleSort {
    public static void main(String args[]) {
        int initialArray[] = {50, 15, 20, 60, 40};
        int sortedArray[] = performSort(initialArray);

        //foreach loop to print the sorted array
        for (int array:sortedArray) {
            System.out.println(array);
        }
    }

    /*
     * This method will sort the array which is passed as the parameter
     * performs the logical operations and returns the sorted array.
     */
    public static int[] performSort(int[] initialArray) {
        int lengthOfArray = initialArray.length;
        for (int i = 0; i < lengthOfArray-1; i++) {
            for (int j = 0; j < lengthOfArray - i - 1; j++) {
                if (initialArray[j] > initialArray[j+1]) {
                    int temp = initialArray[j];
                    initialArray[j] = initialArray[j + 1];
                    initialArray[j + 1] = temp;
                }
            }
        }
        //Sorted array
        return initialArray;
    }
}
