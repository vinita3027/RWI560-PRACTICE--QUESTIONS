package com.thread;

public class DaemonThreadDemo extends Thread {
	public void run() {
		System.out.println("this is child thread");
	}
	public static void main(String[]args) {
		System.out.println("parent thread");
		DaemonThreadDemo d = new DaemonThreadDemo();
		
		d.setDaemon(false);
		d.start();
	}

}
