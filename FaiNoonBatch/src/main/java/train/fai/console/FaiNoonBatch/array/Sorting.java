package train.fai.console.FaiNoonBatch.array;

import java.util.Arrays;

public class Sorting 
{
	public void selection(String[] yet)
	{
		String third=null;
		for(int hold=0;hold<yet.length;hold++)
		{
			for(int com=hold+1;com<yet.length;com++)
			{
				if(yet[hold].compareTo(yet[com])>0)
				{
					third=yet[hold];
					yet[hold]=yet[com];
					yet[com]=third;
				}
			}
		}
	}
	public void bubble(String[] ar)
	{
		String third=null;
		for(int step=0;step<ar.length-1;step++)
		{
			for(int cur=0;cur<ar.length-step-1;cur++)
			{
				if(ar[cur].compareTo(ar[cur+1])<0)//if(ar[cur]<ar[cur+1])
				{
					third=ar[cur];
					ar[cur]=ar[cur+1];
					ar[cur+1]=third;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Sorting order=new Sorting();
		String[] autokar= {"Silviya","Anu","Prabakaran","Razak Mohamed S","Gowtham","Nanda","Gopi","Madhesh","Kishore"};
//		System.out.println("Before bubble: \n"+Arrays.toString(autokar));
//		order.bubble(autokar);
//		System.out.println("After bubble: \n"+Arrays.toString(autokar));
		System.out.println("Before selection: \n"+Arrays.toString(autokar));
		order.selection(autokar);
		System.out.println("After selection: \n"+Arrays.toString(autokar));
	}
}
