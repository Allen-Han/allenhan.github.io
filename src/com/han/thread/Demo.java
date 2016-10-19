package com.han.thread;

public class Demo implements Runnable{
	 private Object objA = new Object();
	    private Object objB = new Object();
	    //标记实现线程可以切换
	    public boolean flag = true;
	    //实现run方法
	    public void run()
	    {
	        //通过判断flag标记目标是让不同的线程在if和else中执行
	        if( flag )
	        {
	            while(true)
	            {
	                synchronized( objA )
	                {
	                    System.out.println(Thread.currentThread().getName()+"....objA");
	                    //t0
	                    synchronized( objB )
	                    {
	                        System.out.println(Thread.currentThread().getName()+"....objB");
	                    }
	                }
	            }
	        }
	        else
	        {
	            while(true)
	            {
	                synchronized( objB )
	                {
	                    System.out.println(Thread.currentThread().getName()+"....objB");
	                    //t1
	                    synchronized( objA )
	                    {
	                        System.out.println(Thread.currentThread().getName()+"....objA");
	                    }
	                }
	            }
	        }
	    }
}
