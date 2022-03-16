package train.fai.console.FaiNoonBatch;

import java.util.Scanner;

public class DemoScan 
{
	public static void main(String[] args) {
		Scanner getting=new Scanner(System.in);
		
		System.out.println("Submit your ITR-2022");
		System.out.println("Tell us your name: ");
		String username=getting.nextLine();
		System.out.println("Tell us type of profession: ");
		String profession=getting.next();
		System.out.println("Tell us annual income: ");
		double annual=getting.nextDouble();
		System.out.println("Tell us email: ");
		String email=getting.next();
		System.out.println("Tell us contact number: ");
		long mobile=getting.nextLong();
		
		System.out.println("Thanks for submitting ITR-2022 Mr./Miss "+username+" of the profession "+profession+" income of "+annual+" further details has sent to your contact "+mobile+" and email "+email);
		
		getting.close();
	}
}
