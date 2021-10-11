class MonitorStarter{
	public static void main(String[] args)
	{
new Monitor();

Monitor monitor1=new Monitor("Dell",20000f,"Blue");
System.out.println(monitor1.brand);
System.out.println(monitor1.price);
System.out.println(monitor1.color);

Monitor monitor2=new Monitor(42f,230,"Computer");
System.out.println(monitor2.inches);
System.out.println(monitor2.supplyVolt);
System.out.println(monitor2.device);

Monitor monitor3=new Monitor("Online Shopping",5,"flat");						
System.out.println(monitor3.purchaseMode);
System.out.println(monitor3.warranty);
System.out.println(monitor3.shape);

Monitor monitor4=new Monitor(18f,"New",1600);
System.out.println(monitor4.bandWidth);
System.out.println(monitor4.model);
System.out.println(monitor4.resolution);

Monitor monitor5=new Monitor(60,"office",17f);
System.out.println(monitor5.frequency);
System.out.println(monitor2.use);
System.out.println(monitor2.weight);

	}

} 