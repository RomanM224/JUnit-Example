package com.maistruk.junitExample.mockitoExamples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.after;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import com.maistruk.junitExample.TestMethods;

//First way enable Mockito annotations
@ExtendWith(MockitoExtension.class)
public class MockExample {

    @BeforeEach
    public void setUp() {
        // Second way enable Mockito annotations
        // MockitoAnnotations.initMocks(this);
    }

    // Old way by using mockito, without annotation
    @Test
    public void mockWihoutAnnotation() {
        List mockedList = Mockito.mock(ArrayList.class);
        mockedList.add("one");
        Mockito.verify(mockedList).add("one");
    }

    @Mock
    List<String> mockList;

    @Test
    public void mockWithAnnotation_1() {
        mockList.add("one");
        Mockito.verify(mockList).add("one");
        // verify with times
        // Mockito.verify(mockList, times(4)).add("one");
    }
    
    @Test
    public void mockVerifyTimeOut() {
        mockList.add("one");
        Mockito.verify(mockList, timeout(1000)).add("one");
        // verify with times
        // Mockito.verify(mockList, times(4)).add("one");
    }
    
    @Test
    public void mockVerifyAfter() {
        mockList.add("one");
        Mockito.verify(mockList, after(5000)).add("one");
        // verify with times
        // Mockito.verify(mockList, times(4)).add("one");
    }

    @Test
    public void mockWithAnnotation_2() {
        mockList.add("one");
        assertEquals(0, mockList.size());
    }

    @Test
    public void mockWithAnnotation_3() {
        mockList.add("one");
        Mockito.when(mockList.size()).thenReturn(100);
        assertEquals(100, mockList.size());
    }

    @Test
    public void mockThrowException_1() {
        List mockedList = Mockito.mock(ArrayList.class);
        Mockito.when(mockedList.add("one")).thenThrow(IllegalArgumentException.class);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            mockedList.add("one");
        });
    }

    @Test
    public void mockThrowException_2() {
        List mockedList = Mockito.mock(ArrayList.class);
        Mockito.doThrow(IllegalArgumentException.class).when(mockedList).add("one");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            mockedList.add("one");
        });
    }
    
    @Test
    public void mockWhenReturn_1() {
        TestMethods methods = Mockito.mock(TestMethods.class);
        Mockito.when(methods.returnInt()).thenReturn(10);
        assertEquals(methods.returnInt(), 10);
    }
    
    @Test
    public void mockWhenReturn_2() {
        TestMethods methods = Mockito.mock(TestMethods.class);
        Mockito.doReturn(10).when(methods).returnInt();
        assertEquals(methods.returnInt(), 10);
    }
    
    @Test
    public void mockDoAnswer() {
        TestMethods methods = Mockito.mock(TestMethods.class);
        Answer<Integer> answer = new Answer<Integer>() {
            @Override
            public Integer answer(InvocationOnMock invocation) throws Throwable {
                return 5;
            }
        };
        Mockito.when(methods.returnInt()).thenAnswer(answer);
        Mockito.doAnswer(answer).when(methods).returnInt();
    }

}
