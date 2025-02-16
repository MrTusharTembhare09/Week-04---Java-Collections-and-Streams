package com.example.annotationsproblems.excercises.suppresswarnings;

import com.example.annotationsproblems.excercises.suppresswarnings.UncheckedWarningExample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class UncheckedWarningExampleTest {

    @Test
    void testRawListContents() {
        // Creating an instance of UncheckedWarningExample
        UncheckedWarningExample example = new UncheckedWarningExample();

        // Getting raw list
        List rawList = example.getRawList();

        // Checking if raw list contains expected values
        assertEquals("Java", rawList.get(0));
        assertEquals(100, rawList.get(1));
        assertEquals(true, rawList.get(2));
    }
}

