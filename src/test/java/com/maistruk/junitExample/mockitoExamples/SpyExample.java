package com.maistruk.junitExample.mockitoExamples;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SpyExample {
    
    @Test
    public void spyWitoutAnnotation() {
        List<String> spyList = Mockito.spy(new ArrayList<String>());
        spyList.add("one");
        Mockito.verify(spyList).add("one");
    }
    
    @Spy
    List<String> spiedList = new ArrayList<String>();
    
    @Test
    public void spyWitAnnotation_1() {
        spiedList.add("one");
        spiedList.add("two");
     
        Mockito.verify(spiedList).add("one");
        Mockito.verify(spiedList).add("two");
    }
    
    @Test
    public void spyWitAnnotation_2() {
        spiedList.add("one");
        spiedList.add("two");
        
        assertEquals(2, spiedList.size());
    }
    
    @Test
    public void spyWitAnnotation_3() {
        spiedList.add("one");
        spiedList.add("two");
        
        Mockito.doReturn(100).when(spiedList).size();
        assertEquals(100, spiedList.size());
    }

}
