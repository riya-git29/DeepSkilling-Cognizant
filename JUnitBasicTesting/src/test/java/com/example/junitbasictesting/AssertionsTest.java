package com.example.junitbasictesting;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        // assertEquals
        assertEquals(5, 2 + 3);

        // assertTrue
        assertTrue(10 > 5);

        // assertFalse
        assertFalse(10 < 5);

        // assertNull
        String str = null;
        assertNull(str);

        // assertNotNull
        Object obj = new Object();
        assertNotNull(obj);

        // assertSame
        String a = "JUnit";
        String b = a;
        assertSame(a, b);

        // assertNotSame
        assertNotSame(new String("Java"), new String("Java"));

        // assertArrayEquals
        int[] expected = {1,2,3};
        int[] actual = {1,2,3};
        assertArrayEquals(expected, actual);
    }
}