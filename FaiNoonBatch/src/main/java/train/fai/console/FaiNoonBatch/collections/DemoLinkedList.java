package train.fai.console.FaiNoonBatch.collections;

import java.util.LinkedList;

/*
 * LinkedList: FiFo
 * 
 * add/ addLast
 * addFirst
 * add(pos,obj)
 * 
 * set(pos,obj)
 * 
 * remove/removeFirst
 * removeLast
 * remove(pos)
 * 
 * get(pos)
 * getFirst()
 * getLast()
 * 
 * indexOf(obj)
 * 
 * 
 */

public class DemoLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<String> link1=new LinkedList<String>();
		link1.add("Anu man");link1.add("Heman");link1.add("Shin Chan");link1.add("Jackie Chan");
		link1.addFirst("Ben 10");link1.addLast("Poppoy");link1.add(1,"Chota bheem");
		
		System.out.println(link1);
		
		link1.removeFirst();//remove
		//System.out.println(link1);
		System.out.println(link1.getFirst());
		
		link1.remove(4);
		System.out.println(link1.get(4));
		
		link1.set(3, "Moon Knight");
		System.out.println(link1);
		
		link1.removeLast();
		
		System.out.println(link1.getLast());
		
		System.out.println(link1.indexOf("Poppoy"));
		
		System.out.println(link1.indexOf("Anu man"));
		
		
	}
}
