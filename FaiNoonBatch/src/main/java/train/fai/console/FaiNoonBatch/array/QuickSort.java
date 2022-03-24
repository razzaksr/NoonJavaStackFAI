package train.fai.console.FaiNoonBatch.array;

import java.util.Arrays;

public class QuickSort 
{
	public static int sort(int[] array,int start,int end)
	{
		int piData=array[end];
		int initial=start-1;
		
		for(int cur=start;cur<end;cur++)
		{
			if(array[cur]<piData)
			{
				initial++;
				int third=array[cur];
				array[cur]=array[initial];
				array[initial]=third;
			}
		}
		
		int third=array[initial+1];
		array[initial+1]=array[end];
		array[end]=third;
		
		return initial+1;
	}
	public static void hello(int[] arr,int start,int end)
	{
		if(end>start)
		{
			int piPoint=sort(arr, start, end);
			hello(arr,start,piPoint-1);
			hello(arr,piPoint+1,end);
		}
	}
	public static void main(String[] args) 
	{
		int[] hai= {34,67,11,98,10,40};
		hello(hai,0,hai.length-1);
		System.out.println(Arrays.toString(hai));
	}
}

