package com.han.main;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
	
	private static ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		new Thread("Thread1"){
			@Override
			public void run() {
				map.put(3, 33);
			}
		};
		
		new Thread("Thread2"){
			@Override
			public void run() {
				map.put(4, 44);
			}
		};
		
		new Thread("Thread3"){
			@Override
			public void run() {
				map.put(7, 77);
			}
		};
//		map.put(3, 33);
//		map.put(4, 44);
//		map.put(7, 77);
		System.out.println(map);
	}
}
