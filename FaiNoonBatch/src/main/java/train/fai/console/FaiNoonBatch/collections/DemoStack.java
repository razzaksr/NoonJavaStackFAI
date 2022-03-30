package train.fai.console.FaiNoonBatch.collections;

import java.util.Iterator;
import java.util.Stack;

/*
 * Stack: Last In First Out
 * 
 * push
 * pop
 * peek
 * search
 * clear
 * 
 * 
 */

public class DemoStack 
{
	public static void main(String[] args) 
	{
		Stack obj=new Stack();
		obj.push("Siliviya");
		obj.push(false);obj.push(1.2);
		obj.push(90);obj.push(8.1F);
		obj.push('P');
		
		//System.out.println(obj);
//		for(Object o:obj)
//		{
//			System.out.println(o);
//		}
		Iterator pointer=obj.iterator();
		
//		while(pointer.hasNext())
//		{
//			System.out.println(pointer.next());
//		}
		
		obj.pop();
		
		System.out.println(obj.peek());
		
		System.out.println(obj.search(false));
		System.out.println(obj.search(true));
		
		obj.clear();
		
		System.out.println(obj.isEmpty());
		
		
	}
}
