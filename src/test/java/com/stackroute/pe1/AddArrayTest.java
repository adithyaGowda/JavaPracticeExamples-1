package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddArrayTest {

   private AddArray addArray;

    @Before
    public void setup(){
        addArray = new AddArray();
    }

    @After
    public void tearDown(){
        addArray = null;
    }

    @Test
    public void inputArrayElementsGivesSum() {
        int[] data = {1,2,3,4,5};
        assertEquals(15, addArray.addingArray(5,data));
    }

    @Test
    public void inputArrayElementsGivesSumAsOutput() {
        int[] data = {1,2,3,4,5,6,7,8};
        assertEquals(28, addArray.addingArray(7,data));
    }

    @Test
    public void inputArrayElementsGivesOutputSum() {
        int[] data = {1,2,3,4};
        assertEquals(10, addArray.addingArray(4,data));
    }

    @Test
    public void inputArrayElementsGivesNull() {

        assertNotNull(addArray.addingArray(4,null));
    }
}