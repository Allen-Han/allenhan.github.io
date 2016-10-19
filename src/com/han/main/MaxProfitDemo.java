package com.han.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Title：MaxProfitDemo.java
 * Description：最大收益算法
 * Company：hiveview.com
 * Author：hanhepeng
 * Email：hanhepeng@btte.net 
 * 2016年10月17日 上午10:57:33
 */
public class MaxProfitDemo {

	/**
	 * 嵌套循环，时间复杂度O(n^2)
	 * @param price
	 */
	public static void getMaxProfit1(int[] price){
		    int length = price.length;
		    int _profit,tmp=0;
		   List<Integer> profit=new ArrayList<Integer>();
		    for(int end = 0;end<length;end++){
		    	for(int start = 0;start<end;start++){
		    		_profit = price[end]-price[start];
		    		profit.add(_profit);
		    	}
		    }
		    
		    for (int i = 0;i<profit.size()-1;i++) {
				if(profit.get(i)>profit.get(i+1)){
					tmp=profit.get(i);
					profit.set(i, profit.get(i+1));
					profit.set(i+1, tmp);
				}
			}
		    System.out.println("方法一最大收益="+profit.get(profit.size()-1));
	}
	
	/**
	 * 一次循环，时间复杂度O(n)
	 * @param price
	 */
	public static void getMaxProfit2(int[] price){
		int min = price[0];
		int profit = 0;
		for(int i =0;i<price.length;i++){
			if(price[i]<min){
				min=price[i];
			}else if(profit<price[i]-min){
				profit=price[i]-min;
			}
		}
		System.out.println("方法二最大收益="+profit);
	}
	
	public static void main(String[] args){
		int[] a ={9,1,2,5,4,6,5,2,3};
		getMaxProfit1(a);
		getMaxProfit2(a);
	}
	
}
