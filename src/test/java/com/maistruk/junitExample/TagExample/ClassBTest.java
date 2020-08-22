package com.maistruk.junitExample.TagExample;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ClassBTest {
    
    @Test
    @Tag("development")
    void testCaseB() {
    }

}
