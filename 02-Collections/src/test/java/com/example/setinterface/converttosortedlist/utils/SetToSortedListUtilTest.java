package com.example.setinterface.converttosortedlist.utils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetToSortedListUtilTest {

    @Test
    public void testConvertToSortedList() {
        // Creating a test set
        Set<Integer> testSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // Expected sorted list
        List<Integer> expectedList = Arrays.asList(1, 3, 5, 9);

        // Checking if the converted list matches the expected list
        assertEquals(expectedList, SetToSortedListUtil.convertToSortedList(testSet));
    }
}

