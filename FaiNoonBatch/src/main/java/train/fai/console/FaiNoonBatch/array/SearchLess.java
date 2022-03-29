package train.fai.console.FaiNoonBatch.array;

import java.util.Arrays;

public class SearchLess 
{
	public int binary(int[] arr,int start,int end,int data)
	{
		if(end>=start)
		{
			//int mid=(end+start)/2;
			int mid=start+(end-start)/2;
			if(arr[mid]==data)
				return mid;
			else if(arr[mid]>data)
				return binary(arr, start, mid-1, data);
			else
				return binary(arr, mid+1, end, data);
		}
		else
			return -1;
	}
	public static void main(String[] args) 
	{
		int[] simple= {90,34,12,89,120,45,80,44,11,56,10};
		Arrays.sort(simple);
		System.out.println(Arrays.toString(simple));
		SearchLess less=new SearchLess();
		System.out.println(less.binary(simple,0,simple.length-1,45));
		System.out.println(less.binary(simple,0,simple.length-1,56));
		System.out.println(less.binary(simple,0,simple.length-1,10));
		System.out.println(less.binary(simple,0,simple.length-1,120));
		System.out.println(less.binary(simple,0,simple.length-1,1));
	}
}
