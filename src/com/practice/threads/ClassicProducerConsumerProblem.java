package com.practice.threads;

import java.util.LinkedList;
import java.util.Queue;

public class ClassicProducerConsumerProblem {

	public static void main(String[] args) throws InterruptedException{
		Buffer buffer = new Buffer(3);
		
		Thread produceThread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					buffer.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread consumeThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					buffer.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		produceThread.start();
		consumeThread.start();
		
		produceThread.join();
		consumeThread.join();
	}
	
	static class Buffer {
		
		private Queue<Integer> queue;
		private int size;
		
		public Buffer(int size) {
			this.queue = new LinkedList<>();
			this.size = size;
		}
		
		public void produce() throws InterruptedException {
			int value = 0;
			
			while(true) {
				synchronized (this) {
					while(queue.size() >= size) {
						wait();
					}
					queue.add(value);
					
					System.out.println("Produced: " + value);
					
					value++;
					
					notify();
					
					Thread.sleep(100);
				}
			}
		}
		
		public void consume() throws InterruptedException {
			while(true) {
				synchronized (this) {
					while(queue.size() == 0) {
						wait();
					}
					int value = queue.poll();
					
					System.out.println("Consumed: " + value);
					
					notify();
					
					Thread.sleep(1000);
				}
			}
		}
	}
}
