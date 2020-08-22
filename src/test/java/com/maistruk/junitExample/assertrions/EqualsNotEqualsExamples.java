package com.maistruk.junitExample.assertrions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class EqualsNotEqualsExamples {

    @Test
    public void assertEquals_1() {
        // Test will pass
        Assertions.assertEquals(4, 4);
    }

    @Test
    public void assertEquals_2() {
        // Test will fail
        Assertions.assertEquals(3, 4, "Actual:4 test failed");
    }

    @Test
    public void assertEquals_3() {
        // Test will fail
        String messageSupplier = "Actual:4 test failed";
        Assertions.assertEquals(3, 4, messageSupplier);
    }

    @Test
    public void assertNotEquals_1() {
        // Test will pass
        Assertions.assertNotEquals(3, 4);
    }

    @Test
    public void assertNotEquals_2() {
        // Test will fail
        Assertions.assertNotEquals(4, 4, "Test failed");
    }

    @Test
    public void assertNotEquals_3() {
        // Test will fail
        String messageSupplier = "Test failed";
        Assertions.assertNotEquals(4, 4, messageSupplier);
    }

}
