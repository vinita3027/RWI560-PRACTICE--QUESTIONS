package com.thread;

public class yeildThread extends Thread {
		public void run() {
			for(int i = 1;i < 3;i++) {
				System.out.println(Thread.currentThread().getName()+"myThread");
			}
		}
		public static void main(String[]args) {
			yeildThread y1 = new yeildThread();
			yeildThread y2 = new yeildThread();
			y1.start();
			y2.start();
			
			
			for(int i = 1; i < 3; i++) {
				y1.yield();
				System.out.println(Thread.currentThread().getName()+"myThread");
			}
		}
}
