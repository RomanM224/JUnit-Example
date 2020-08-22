package com.maistruk.junitExample.assertrions;

import java.lang.reflect.Method;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.maistruk.junitExample.TestMethods;

@RunWith(JUnitPlatform.class)
public class AssertTimeoutExample {
    
    TestMethods methods = new TestMethods();
    
    @Test
    public void assertTimeout_1() {
      //This will pass
        Assertions.assertTimeout(Duration.ofMinutes(1),() ->  methods.returnInt());
    }
    
    @Test
    public void assertTimeout_2() {
      //This will fail
        Assertions.assertTimeout(Duration.ofMillis(500),() ->  methods.returnIntAfter1000mils());
    }


}
