package com.example.queueinterface.generatebinarynumbers.utils;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryUtilTest {

    @Test
    public void testGenerateBinaryNumbers() {
        List<String> result = BinaryUtil.generateBinaryNumbers(5);

        assertEquals(List.of("1", "10", "11", "100", "101"), result);
    }
}

