package com.bestsoft.thread.lockdemo;

public class LockTest {
	public static String obj1 = "obj1";  
    public static String obj2 = "obj2";  
    public static void main(String[] args) {  
        LockA la = new LockA();  
        new Thread(la).start();  
        LockB lb = new LockB();  
        new Thread(lb).start();  
    }  
}
