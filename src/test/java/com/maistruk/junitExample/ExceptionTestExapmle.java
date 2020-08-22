package com.maistruk.junitExample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ExceptionTestExapmle {
    
    TestMethods methods = new TestMethods();

    @Test
    void testExpectedException() {
        //Throws NumberFormatException.class
        Assertions.assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("One");
        });
    }

    @Test
    void testExpectedExceptionWithSuperType() {
        //Throws NumberFormatException.class, and NumberFormatException.class extends IllegalArgumentException.class
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("One");
        });
    }
    
    @Test
    void throwIllegalArgumentException_catchIllegalArgumentException() {
        //Throws NumberFormatException.class, and NumberFormatException.class extends IllegalArgumentException.class
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            methods.throwMethod();;
        });
    }
    
    //Fails
    @Test
    void throwIllegalArgumentException_catchNumberFormatException() {
        //Throws NumberFormatException.class, and NumberFormatException.class extends IllegalArgumentException.class
        Assertions.assertThrows(NumberFormatException.class, () -> {
            methods.throwMethod();;
        });
    }

    //Fails
    @Test
    void testExpectedExceptionFail() {
        //This example not throws exception
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("1");
        });
    }

}
