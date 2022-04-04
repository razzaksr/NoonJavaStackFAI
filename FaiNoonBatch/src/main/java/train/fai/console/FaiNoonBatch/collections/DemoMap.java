package train.fai.console.FaiNoonBatch.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

/*
 * Map<KeyClass,ValueClass>
 * 
 * put(k,v)
 * putAll
 * 
 * get(k)
 * 
 * remove(k)
 * 
 * containsKey
 * containsValue
 * 
 * keySet	>> Set
 * values	>> Collection
 * 
 * Hashtable>> 11bits, synchronized
 * HashMap
 * TreeMap
 * 
 */

public class DemoMap 
{
	public static void main(String[] args) 
	{
		HashMap<String, String[]> marvel=new HashMap<String, String[]>();
		
		marvel.put("X Men", new String[] {"Volverine","Beast","Magnito","Jean"});
		marvel.put("Age of ultron", new String[] {"Vision","Wanda","Pietro","Hawkeye","Natasha","Thor"});
		marvel.put("Deadpool", new String[] {"Ryan","Volverine","Francis"});
		marvel.put("Spiderman", new String[] {"Tobey","Andrew","Holland","MJ","May","Zendaya"});
		
//		for(String h:marvel.keySet())
//		{
//			System.out.println(h+" "+Arrays.toString(marvel.get(h)));
//		}
		
		Hashtable<Integer, String> ipl=new Hashtable<Integer, String>();
		ipl.put(2021, "CSK");ipl.put(2013, "MI");
		ipl.put(2020, "MI");ipl.put(2015, "KKR");
		ipl.put(2009, "DC");ipl.put(2011, "RCB");
		ipl.put(2008, "RR");ipl.put(2014, "SRH");
		
		System.out.println(ipl);
		
		TreeMap<Integer, String> icl=new TreeMap<Integer, String>();
		icl.putAll(ipl);
		
		System.out.println(icl);
		
		icl.remove(2015);
		
		System.out.println(ipl.containsKey(2015));
		
		System.out.println(icl.containsValue("KKR"));
		
		ipl.remove(2013);
		
		System.out.println(ipl.containsValue("MI"));
		
		Collection<String> teams=icl.values();
		System.out.println("ICL teams are: "+teams);
		
		Set<Integer> year=ipl.keySet();
		System.out.println("IPL years: "+year);
	}
}
