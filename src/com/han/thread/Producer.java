package com.han.thread;

import java.util.Random;

public class Producer implements Runnable{

	private Resource resource;

	public Producer(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
//		while (true) {
			System.out.println(Thread.currentThread().getId());
			int num = new Random().nextInt();
			resource.putResource("num =" + num);
//		}
	}

}
