package train.fai.console.FaiNoonBatch.array;

import java.util.Arrays;

public class Sorting 
{
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
		String[] autokar= {"Silviya","Anu","Prabakaran","Razak Mohamed S","Gowtham","Nanda","Gopi","Madhesh","Kishore"};
		System.out.println("Before bubble: \n"+Arrays.toString(autokar));
		Sorting order=new Sorting();
		order.bubble(autokar);
		System.out.println("After bubble: \n"+Arrays.toString(autokar));
	}
}
