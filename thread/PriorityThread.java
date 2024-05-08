package com.thread;

public class PriorityThread extends Thread {
    public void run() {
    	System.out.println("child Thread");
    	System.out.println(Thread.currentThread().getName());
    }
    
    public static void main(String[]args) {
    	System.out.println(Thread.currentThread().getName());
    	
    	PriorityThread p = new PriorityThread();
    	p.setPriority(5);
    	p.start();
    }
    
}
