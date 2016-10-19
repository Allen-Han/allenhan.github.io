package com.han.sort;

/**
 * Title：Sort.java Description：各种排序 Company：hiveview.com Author：hanhepeng
 * Email：hanhepeng@btte.net 2016年9月22日 上午9:56:02
 */
public class Sort {

	/**
	 * 冒泡排序
	 * 
	 * @param array
	 * @return
	 */
	public static int[] bubbleSort(int[] array) {
		int tmp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length -1- i; j++) {
				if (array[j] > array[j + 1]) {
					tmp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}

	/**
	 * 快速排序
	 * 
	 * @param array
	 * @return
	 */
	public static int[] quickSort(int[] array) {
		if (array.length > 0) {
			_quickSort(array, 0, array.length - 1);
		}
		return array;
	}

	/**
	 * 选择排序
	 * 
	 * @param array
	 * @return
	 */
	public static int[] selectSort(int[] array) {
		int position = 0;
		for (int i = 0; i < array.length-1; i++) {
			position = i; //当前未排序的最小位置
			int tmp = array[i]; //未排序的最小值
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < tmp) {
					tmp = array[j];
					position = j;
				}
			}
			array[position] = array[i];
			array[i] = tmp;
		}
		return array;
	}

	/**
	 * 递归
	 * 
	 * @param array
	 * @param low
	 * @param high
	 */
	private static void _quickSort(int[] array, int low, int high) {
		if (low < high) {
			int middle = getMiddle(array, low, high);
			_quickSort(array, low, middle - 1);
			_quickSort(array, middle + 1, high);
		}
	}

	/**
	 * 执行一次排序，返回中间值位置
	 * 
	 * @param array
	 * @param low
	 * @param high
	 * @return
	 */
	private static int getMiddle(int[] array, int low, int high) {
		int tmp = array[low];
		while (low < high) {
			while (low < high && array[high] >= tmp) {
				high--;
			}
			array[low] = array[high];
			while (low < high && array[low] <= tmp) {
				low++;
			}
			array[high] = array[low];
		}
		array[low] = tmp;
		return low;
	}
	
}
