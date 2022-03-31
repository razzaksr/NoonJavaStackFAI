package train.fai.console.FaiNoonBatch.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

/*
 * ArrayList	>> asynchronized, 10,20,30, 
 * Vector		>> synchronized, 10,15
 * add
 * add(pos,obj)
 * addAll
 * 
 * set
 * 
 * remove(pos)
 * remove(object)
 * 
 * get(pos)
 * 
 * retainAll
 * removeAll
 * 
 * Collections:
 * 	sort
 * 	reverse
 * 	max
 * 	min
 * 	replaceAll
 * 
 * 
 * 
 */

public class ListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Character> list1=new ArrayList<Character>();
		Vector<Character> list2=new Vector<Character>();
		
		list2.add('W');list2.add('F');list2.add('O');list2.add('E');list2.add('Q');
		list2.add('W');list2.add('Z');list2.add('R');list2.add('A');list2.add('K');
		
		System.out.println("Vector: "+list2);
		
		list1.addAll(list2);
		
		System.out.println("ArrayList: "+list1);
		
		list1.add(3,'M');list2.set(7, 'S');
		System.out.println("ArrayList: "+list1);
		System.out.println("Vector: "+list2);
		
		list1.remove(8);// by pos
		list2.remove((Object)'Q');// object
		System.out.println("ArrayList: "+list1);
		System.out.println("Vector: "+list2);
		
		list1.retainAll(list2);
		System.out.println("ArrayList: "+list1);
		
		list2.removeAll(list1);
		System.out.println("Vector: "+list2);
		
		
		Collections.sort(list1);
		System.out.println("ArrayList: "+list1);
		Collections.reverse(list1);
		System.out.println("ArrayList: "+list1);
		
		System.out.println(Collections.max(list1));
		System.out.println(Collections.min(list1));
		
		Collections.replaceAll(list1, 'W', 'T');
		System.out.println("ArrayList: "+list1);
		
	}
}
