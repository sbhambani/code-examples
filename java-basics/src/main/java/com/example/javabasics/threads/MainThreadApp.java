package com.example.javabasics.threads;

public class MainThreadApp {

	public static void main(String [] args) throws InterruptedException {
		Thread firstThread = new Thread(new FirstRunnable());
		Thread secondThread = new Thread(new SecondRunnable());
		Thread thirdThread = new Thread(new ThirdRunnable());
		firstThread.start();
		//firstThread.join();
		secondThread.start();
		//secondThread.join();
		thirdThread.start();
		//thirdThread.join();
		System.out.println("Main thread app completed...");
	}
}
