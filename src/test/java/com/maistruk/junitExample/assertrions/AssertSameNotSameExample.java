package com.maistruk.junitExample.assertrions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssertSameNotSameExample {

    @Test
    public void assertNotSame_1() {
        String originalObject = "howtodoinjava.com";
        String cloneObject = originalObject;
        String otherObject = "example.com";

        // Test will pass
        Assertions.assertNotSame(originalObject, otherObject);
    }

    @Test
    public void assertNotSame_2() {
        String originalObject = "howtodoinjava.com";
        String cloneObject = originalObject;
        String otherObject = "example.com";

        // Test will fail
        Assertions.assertNotSame(originalObject, cloneObject);
    }

    @Test
    public void assertSame_1() {
        String originalObject = "howtodoinjava.com";
        String cloneObject = originalObject;
        String otherObject = "example.com";

        // Test will pass
        Assertions.assertSame(originalObject, cloneObject);
    }

    @Test
    public void assertSame_2() {
        String originalObject = "howtodoinjava.com";
        String cloneObject = originalObject;
        String otherObject = "example.com";

        // Test will fail
        Assertions.assertSame(originalObject, otherObject);
    }

}
