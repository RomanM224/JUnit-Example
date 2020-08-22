package com.maistruk.junitExample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

public class DisplayNameReapeatedTestExample {

    // We can use information abour repetitions
    @BeforeEach
    public void initEach(RepetitionInfo info) {
        int currentRepetition = info.getCurrentRepetition();
        int totalRepetitions = info.getTotalRepetitions();
        System.out.println(
                "BeforeEach current repetition: " + currentRepetition + " total repetition: " + totalRepetitions);
    }

    // We can use information abour repetitions
    @AfterEach
    public void cleanUpEach(RepetitionInfo info) {
        int currentRepetition = info.getCurrentRepetition();
        int totalRepetitions = info.getTotalRepetitions();
        System.out.println(
                "BeforeEach current repetition: " + currentRepetition + " total repetition: " + totalRepetitions);
    }
    
    
    
    @DisplayName("Test example")
    @RepeatedTest(value = 3, name = "{displayName} - repetition {currentRepetition} of {totalRepetitions}")
    void test1() {
        System.out.println("======DisplayName=======");
        Assertions.assertEquals(4, 4);
    }

    @DisplayName("Test example")
    @RepeatedTest(value = 3, name = RepeatedTest.SHORT_DISPLAY_NAME)
    void test2() {
        System.out.println("======DisplayName RepeatedTest.SHORT_DISPLAY_NAME=======");
        Assertions.assertEquals(4, 4);
    }

    @DisplayName("Test example")
    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    void test3() {
        System.out.println("======DisplayName RepeatedTest.LONG_DISPLAY_NAME=======");
        Assertions.assertEquals(4, 4);
    }

}
