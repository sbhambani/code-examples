package com.example.javabasics.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThirdRunnable implements Runnable {

	private static final Logger logger = LoggerFactory.getLogger(ThirdRunnable.class);

	@Override
	public void run() {
		logger.debug("Third thread started");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.debug("Third thread completed");
	}
	
	
}
