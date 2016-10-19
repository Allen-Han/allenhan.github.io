package com.han.thread;

public class Consumer implements Runnable {

	private Resource resource;

	public Consumer(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
//		while (true) {
		System.out.println(Thread.currentThread().getId());
			resource.getResource();
//		}
	}

}
