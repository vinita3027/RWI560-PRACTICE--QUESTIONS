package com.thread;

	public class isAlive extends Thread
	{
	    public void run()
	    {
	        System.out.println("r1 ");
	        try {
	            Thread.sleep(500);
	        }
	        catch(InterruptedException e)
	        {

	        }
	        System.out.println("r2 ");
	    }
	    public static void main(String[] args)
	    {
	        isAlive t1=new isAlive();
	        isAlive t2=new isAlive();
	        t1.start();
	        t2.start();
	        System.out.println(t1.isAlive());
	        System.out.println(t2.isAlive());
	    }
	}

