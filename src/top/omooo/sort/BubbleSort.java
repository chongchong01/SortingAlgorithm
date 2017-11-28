package top.omooo.sort;

import java.util.Scanner;

/**
 * 冒泡排序
 * 第一轮循环就得到了最大数，第二轮循环得到第二大数......
 *
 */
public class BubbleSort {
	
	public static void sort(int[] data) {
		for(int i=0;i<data.length-1;i++) {
			for(int j=0;j<data.length-1-i;j++) {
				if(data[j]>data[j+1]) {
					int index=data[j+1];
					data[j+1]=data[j];
					data[j]=index;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] nums = null;   
	    nums = scanner.nextLine().split(" ");   
	    int data[]=new int[nums.length];  
	    for(int i=0;i<data.length;i++){  
	    	data[i]=Integer.valueOf(nums[i]);  
	    }
	    sort(data);
	    for(int i=0;i<data.length;i++){  
	    	System.out.print(data[i]+"  ");  
	    }
	}
}
