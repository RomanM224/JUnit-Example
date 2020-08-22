package com.maistruk.junitExample.assertrions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssertNullNotNullExample {

    @Test
    public void assertNotNull_1() {
        String nullString = null;
        String notNullString = "Smt Here";

        // Test will pass
        Assertions.assertNotNull(notNullString);
    }

    @Test
    public void assertNotNull_2() {
        String nullString = null;
        String notNullString = "Smt Here";

        // Test will fail
        Assertions.assertNotNull(nullString);
    }

    @Test
    public void assertNull_1() {
        String nullString = null;
        String notNullString = "Smt Here";

        // Test will pass
        Assertions.assertNull(nullString);
    }

    @Test
    public void assertNull_2() {
        String nullString = null;
        String notNullString = "Smt Here";

        // Test will fail
        Assertions.assertNull(notNullString);
    }

}
