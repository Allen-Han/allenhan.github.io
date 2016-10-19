package com.han.thread;

public class Resource {

	private String someThing = "";
	private boolean hasResource = false;

	public synchronized void putResource(String someThing) {
		while (hasResource) {
			try {
				System.out.println("生产者等待");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.someThing = someThing;
		System.out.println("putResource:" + someThing);
		this.hasResource = true;
		System.out.println("生产者运行");
		this.notify();
	}

	public synchronized String getResource() {
		while (!hasResource) {
			try {
				System.out.println("消费者等待");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.hasResource = false;
		System.out.println("getResource:" + this.someThing);
		System.out.println("消费者运行");
		this.notify();
		return this.someThing;
	}

}
