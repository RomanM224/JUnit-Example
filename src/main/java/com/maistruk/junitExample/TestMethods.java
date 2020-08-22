package com.maistruk.junitExample;


public class TestMethods {
    
    public void throwMethod() {
        throw new IllegalArgumentException();
    }
    
    public int returnInt() {
        return 5;
    }
    
    public int returnIntAfter1000mils() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 5;
    }
    
    public void returnVoid() {
        
    }

}
