package com.thread;

public class JoinThread extends Thread {
    public void run() {
        for (int i = 1; i<=3; i++)
        
            System.out.println(i);
    }

    public static void main(String[] args) {
    	JoinThread j1 = new JoinThread();
        j1.start();
        try {
            j1.join();
        } catch (Exception e) {
           System.out.println(e);
        }

        JoinThread j2 = new JoinThread();
        JoinThread j3 = new JoinThread();
        JoinThread j4 = new JoinThread();
        j2.start();
        j3.setPriority(10); 
        j3.start();
        j4.start(); 

        try {
            j2.join();
            j3.join();
            j4.join();
        } catch (Exception e) {
            System.out.println(e); 
        }
    }
}
