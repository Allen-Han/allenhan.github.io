package com.han.main;

import com.han.thread.Demo;

public class DeadLock {
	public static void main(String[] args) {
		Demo d = new Demo();

		Thread t = new Thread(d);
		Thread t2 = new Thread(d);

		t.start();
		try {
			Thread.sleep(1);
		} catch (Exception e) {
		}
		d.flag = false;
		t2.start();
		// List<Demo> list = new ArrayList<Demo>();
		// for(int i=0;i<100000;i++){
		// System.out.println("demo"+i);
		// Demo demo = new Demo();
		// list.add(demo);
		// }
	}
}
