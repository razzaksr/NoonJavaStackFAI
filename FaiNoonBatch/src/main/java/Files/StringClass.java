package Files;

public class StringClass 
{
	public static void main(String[] args) 
	{
		String a="Razak";//literal
		String name1=new String("Manoj");//non-literal
		
		System.out.println(name1);//Manoj
		name1=name1.concat("Kumar");
		System.out.println(name1);//Manojkumar
		System.out.println(name1);
		System.out.println(name1.replace("Manoj", "Dinesh"));
		System.out.println(name1);
		
//		for(int i=0;i<name1.length();i++)
//		{
//			char c=name1.charAt(i);
//			System.out.println(c);
//		}
		System.out.println(name1.charAt(5));
		
		StringBuffer buff=new StringBuffer("Manoj");
		System.out.println(buff);
		buff.append("Kumer");
		System.out.println(buff);//Manojkumar
		buff.reverse();
		System.out.println(buff);//
		System.out.println(buff);//
		buff.replace(5, 9, "Razak");
		System.out.println(buff);
		buff.delete(5, 9);
		System.out.println(buff);
		
		
	}

}
