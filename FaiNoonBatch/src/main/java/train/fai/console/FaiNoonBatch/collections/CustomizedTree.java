package train.fai.console.FaiNoonBatch.collections;

import java.util.TreeSet;

public class CustomizedTree 
{
	public static void main(String[] args) 
	{
		TreeSet<Bike> show=new TreeSet<Bike>();
		
		Bike b1=new Bike();b1.name="Access125";b1.owner="Prabakar";
		b1.mileage=40.3;b1.price=87.5F;b1.year=2020;
		Bike b2=new Bike();b2.name="RE";b2.owner="Silviya";
		b2.mileage=21.3;b2.price=135.7F;b2.year=2021;
		Bike b3=new Bike();b3.name="Himalayan";b3.owner="Anu Man";
		b3.mileage=20.3;b3.price=147.5F;b3.year=2019;
		Bike b4=new Bike();b4.name="RX100";b4.owner="Prabakar";
		b4.mileage=32.3;b4.price=57.5F;b4.year=2009;
		
		//System.out.println(b1);
		
		show.add(b1);show.add(b2);show.add(b3);show.add(b4);
		
		System.out.println(show);
	}
}

class Bike implements Comparable<Bike>
{
	public String owner;
	public String name;
	public Integer year;
	public Double mileage;
	public Float price;
	@Override
	public String toString() {
		return "Bike [owner=" + owner + ", name=" + name + ", year=" + year + ", mileage=" + mileage + ", price="
				+ price + "]\n";
	}
	@Override
	public int compareTo(Bike anu) {
		// TODO Auto-generated method stub
		//return this.owner.compareTo(anu.owner);
		//return anu.owner.compareTo(this.owner);
		return anu.price.compareTo(this.price);
	}
	
}