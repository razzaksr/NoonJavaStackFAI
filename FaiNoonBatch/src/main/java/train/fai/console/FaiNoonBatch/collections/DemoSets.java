package train.fai.console.FaiNoonBatch.collections;

import java.util.HashSet;
import java.util.TreeSet;

/*
 * Set: 
 * TreeSet	:	ascending
 * HashSet	:	system defined order/random
 * 
 * add
 * addAll
 * remove
 * 
 * retainAll
 * removeAll
 * 
 * contains
 */

public class DemoSets 
{
	public static void main(String[] args) 
	{
		HashSet set1=new HashSet();
		set1.add("CSK");set1.add("LSG");set1.add("MI");set1.add("KKR");
		set1.add("RCB");set1.add("DD");set1.add("RR");set1.add("GL");
		
		System.out.println(set1);
		
		TreeSet set2=new TreeSet();
		set2.addAll(set1);
		
		System.out.println(set2);
		
		set1.remove("KKR");
		
		System.out.println(set2.contains("KKR"));
		
		System.out.println(set1.contains("DC"));
		
		System.out.println(set1);
		System.out.println(set2);
	}
}
