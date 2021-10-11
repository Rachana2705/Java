class StabilizerStarter{
	public static void main(String[] args)
	{
new Stabilizer();

new Stabilizer(5000.00f);

Stabilizer stabilizer1=new Stabilizer("White",410,55.00f);
System.out.println(stabilizer1);
System.out.println("==============");
System.out.println(stabilizer1.colour);
System.out.println(stabilizer1.voltage);
System.out.println(stabilizer1.powerRating);
System.out.println(stabilizer1.ratings);

Stabilizer stabilizer2=new Stabilizer(230,3,85.00f,4.5f,8.5f);
System.out.println(stabilizer2);
System.out.println(stabilizer2.supplyVolt);
System.out.println(stabilizer2.amperes);
System.out.println(stabilizer2.efficiency);
System.out.println(stabilizer2.weight);
System.out.println(stabilizer2.powerFactor);

Stabilizer stabilizer3=new Stabilizer("Refrigerator","Online",5);						
System.out.println(stabilizer3.appliances);
System.out.println(stabilizer3.purchaseMode);
System.out.println(stabilizer3.warranty);

Stabilizer stabilizer4=new Stabilizer(15.67f,"Sony",3500f);
System.out.println(stabilizer4.size);
System.out.println(stabilizer4.brand);
System.out.println(stabilizer4.price);

Stabilizer stabilizer5 = new Stabilizer(9.0f,8.5f);
System.out.println(stabilizer1.ratings);
System.out.println(stabilizer2.powerFactor);

	}

} 