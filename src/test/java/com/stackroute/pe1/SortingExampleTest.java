package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingExampleTest {

    private SortingExample sortingExample;

    @Before
    public void setup(){
        sortingExample = new SortingExample();
    }

    @After
    public void tearDown(){
        sortingExample = null;
    }

    @Test
    public void inputDataSortsInDescendingOrder() {

        int[] data = {4,2,1,3,5};
        assertEquals(6, sortingExample.sortingDescendingOrder(5,data));
    }

    @Test
    public void inputDataSortsInDescendingOrderAndSums() {

        int[] data = {4,2,1,3,5,4,2,7};
        assertEquals(12, sortingExample.sortingDescendingOrder(8,data));
    }

    @Test
    public void inputDataSortsInDescendingGivesZero() {


        assertEquals(0, sortingExample.sortingDescendingOrder(8,null));
    }

    @Test
    public void inputDataSortsInDescendingGivesNotNullOutput() {


        assertNotNull(sortingExample.sortingDescendingOrder(8,null));
    }

}