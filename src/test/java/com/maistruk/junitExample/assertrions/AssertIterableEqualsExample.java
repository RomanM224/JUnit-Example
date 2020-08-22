package com.maistruk.junitExample.assertrions;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class AssertIterableEqualsExample {

    @Test
    public void assertIterableEquals_1() {
        Iterable<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Iterable<Integer> listTwo = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Iterable<Integer> listThree = new ArrayList<>(Arrays.asList(1, 2, 3));
        Iterable<Integer> listFour = new ArrayList<>(Arrays.asList(1, 2, 4, 3));

        // Test will pass
        Assertions.assertIterableEquals(listOne, listTwo);
    }

    @Test
    public void assertIterableEquals_2() {
        Iterable<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Iterable<Integer> listTwo = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Iterable<Integer> listThree = new ArrayList<>(Arrays.asList(1, 2, 3));
        Iterable<Integer> listFour = new ArrayList<>(Arrays.asList(1, 2, 4, 3));

        // Test will fail
        Assertions.assertIterableEquals(listOne, listThree);
    }

    @Test
    public void assertIterableEquals_3() {
        Iterable<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Iterable<Integer> listTwo = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Iterable<Integer> listThree = new ArrayList<>(Arrays.asList(1, 2, 3));
        Iterable<Integer> listFour = new ArrayList<>(Arrays.asList(1, 2, 4, 3));

        // Test will fail
        Assertions.assertIterableEquals(listOne, listFour);
    }
}
