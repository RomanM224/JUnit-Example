package com.maistruk.junitExample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssumptionExample {
    
    @Test
    public void assumeTrue_true() {
        boolean value = true;
        Assumptions.assumeTrue(value);
        Assertions.assertEquals(4, 4);
    }
    
    @Test
    public void assumeTrue_false() {
        boolean value = false;
        Assumptions.assumeTrue(value);
        Assertions.assertEquals(4, 4);
    }
    
    @Test
    public void assumeFalse_true() {
        boolean value = true;
        Assumptions.assumeFalse(value);
        Assertions.assertEquals(4, 4);
    }
    
    @Test
    public void assumeFalse_false() {
        boolean value = false;
        Assumptions.assumeFalse(value);
        Assertions.assertEquals(4, 4);
    }

}
