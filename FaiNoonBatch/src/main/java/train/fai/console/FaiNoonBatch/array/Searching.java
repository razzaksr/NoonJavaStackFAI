package train.fai.console.FaiNoonBatch.array;

public class Searching 
{
	public static int linear(String[] arr,String users)
	{
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index].equalsIgnoreCase(users)) {
				return index;
			}
		}
		return -1;
	}
	
	public static void print(int start,int end)
	{
		if(end>=start)
		{
			System.out.println("Hello Zealous "+start);
			Searching.print(start+1,end);
		}
		return;
	}
	
	public static void recursive(String[] h,int start,int end)
	{
		if(end>start)
		{
			System.out.println(h[start]);
			recursive(h, start+1, end);
		}
		return;
	}
	
	public static void main(String[] args) 
	{
		String[] autokar= {"Silviya","Anu","Prabakaran","Razak Mohamed S","Gowtham","Nanda","Gopi","Madhesh","Kishore"};
//		System.out.println(Searching.linear(autokar,"Anu"));
//		System.out.println(Searching.linear(autokar,"Annamalai"));
//		System.out.println(Searching.linear(autokar,"Siliviya"));
//		System.out.println(Searching.linear(autokar,"Nanda"));
//		System.out.println(Searching.linear(autokar,"anu"));
		Searching.print(10,20);
		Searching.recursive(autokar, 0, autokar.length);
	}
}

