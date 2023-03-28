package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class MissingNumberTest {
    private int[] missingMax = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private int[] missingNone = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private int[] missingSeven = {1, 2, 3, 4, 5, 6, 8, 9, 10 };
    private MissingNumber mn = new MissingNumber();

    @Test
    public void testMissingNumber_MissingMax() {
        assertEquals(10, mn.missingNumber(missingMax, 10));
    }
}
