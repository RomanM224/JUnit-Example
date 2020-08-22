package com.maistruk.junitExample.assertrions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssertTrueFalseExample {

    private static String message() {
        return "Test execution result";
    }
     
    private static boolean getTrue() {
        return true;
    }
    
    @Test
    public void assertTrue_1() {
        boolean trueBool = true;
        boolean falseBool = false;
        
        Assertions.assertTrue(trueBool);
    }
    
    @Test
    public void assertTrue_2() {
        boolean trueBool = true;
        boolean falseBool = false;
        
        Assertions.assertTrue(falseBool, "test execution message");
    }
    
    @Test
    public void assertTrue_3() {
        boolean trueBool = true;
        boolean falseBool = false;
        
        Assertions.assertTrue(falseBool, AssertTrueFalseExample::message);
    }
    
    @Test
    public void assertTrue_4() {
        boolean trueBool = true;
        boolean falseBool = false;
        
        Assertions.assertTrue(AssertTrueFalseExample::getTrue, AssertTrueFalseExample::message);
    }
    
    @Test
    public void assertFalse_1() {
        boolean trueBool = true;
        boolean falseBool = false;
        
        Assertions.assertFalse(trueBool);
    }
    
    @Test
    public void assertFalse_2() {
        boolean trueBool = true;
        boolean falseBool = false;
        
        Assertions.assertFalse(falseBool, "test execution message");
    }
    
    @Test
    public void assertFalse_3() {
        boolean trueBool = true;
        boolean falseBool = false;
        
        Assertions.assertFalse(falseBool, AssertTrueFalseExample::message);
    }
    
    @Test
    public void assertFalse_4() {
        boolean trueBool = true;
        boolean falseBool = false;
        
        Assertions.assertFalse(AssertTrueFalseExample::getTrue, AssertTrueFalseExample::message);
    }
    

    
    
}
