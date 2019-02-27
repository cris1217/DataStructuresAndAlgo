package com.datastructures.sorting;

import org.junit.Assert;
import org.junit.Test;
/*
 * To test the functionality of the bubble sort.
 */
public class TestBubbleSort {

    /*
     * @testArray This is the testArray passed to bubble sort algorithm.
     * @expectedArray This is the expected array after sorting the passed array.
     * This is to test by passing the valid output
     */
    @Test
    public void testBubbleSortValid(){
        int testArray[]={20,40,30,70,50};
        int expectedArray[]={20,30,40,50,70};
        //Assertion statement to test the correctness of sorted array.
        Assert.assertArrayEquals(BubbleSort.performSort(testArray),expectedArray);

    }
    /*
     * @testArray This is the testArray passed to bubble sort algorithm.
     * @expectedArray This is the expected array after sorting the passed array.
     * This is to test with invalid output.
     */
    @Test
    public void testBubbleSortInvalid(){
        int testArray[]={20,40,30,70,50};
        int expectedArray[]={20,40,30,50,70};

        //Assertion statement to test the correctness of sorted array.
        Assert.assertNotEquals(BubbleSort.performSort(testArray),expectedArray);

    }
}
