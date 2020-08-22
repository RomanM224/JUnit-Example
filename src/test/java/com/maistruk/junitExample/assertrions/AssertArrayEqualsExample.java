package com.maistruk.junitExample.assertrions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssertArrayEqualsExample {

    @Test
    public void assertArrayEquals_1() {
        // Test will pass
        Assertions.assertArrayEquals(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 }, "Array Equal Test");
    }

    @Test
    public void assertArrayEquals_2() {
        // Test will fail because element order is different
        Assertions.assertArrayEquals(new int[] { 1, 2, 3 }, new int[] { 1, 3, 2 }, "Array Equal Test");
    }

    @Test
    public void assertArrayEquals_3() {
        // Test will fail because number of elements are different
        Assertions.assertArrayEquals(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3, 4 }, "Array Equal Test");
    }

}
