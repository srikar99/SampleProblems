package com.practice.threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class PCWithExecutorService {

	public static void main(String[] args) throws InterruptedException{
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
		ExecutorService threadPool = Executors.newFixedThreadPool(2);

		Runnable producerThread = () -> {
			int value = 0;
			while (true) {
				try {
					queue.put(value);
					System.out.println("Produced: " + value);
					value++;
					
					Thread.sleep(100);
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Runnable consumerThread = () -> {
			while (true) {
				try {
					int val = queue.take();
					System.out.println("Consumed: " + val);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		threadPool.execute(producerThread);
		threadPool.execute(consumerThread);
	}
}
