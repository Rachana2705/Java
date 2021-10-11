class ScooterStarter{
	public static void main(String[] args)
	{
new Scooter();

Scooter scooter=new Scooter(100000.00f,"TVS");
System.out.println(scooter);
System.out.println(scooter.price);
System.out.println(scooter.brand);

Scooter scooter1=new Scooter("Red","Black");
System.out.println(scooter1.color);
System.out.println(scooter1.seatColor);

Scooter scooter2=new Scooter(95.00d,55.00f,"fuel type");	
System.out.println(scooter2.weight);
System.out.println(scooter2.mileage);
System.out.println(scooter2.type);

Scooter scooter3=new Scooter("New",5.3f,true);
System.out.println(scooter3.model);
System.out.println(scooter3.fuelTank);
System.out.println(scooter3.insurance);

Scooter scooter4=new Scooter(45.00f,60.0f,"Karnataka",7345,"tube");
System.out.println(scooter4.length);
System.out.println(scooter4.speed);
System.out.println(scooter4.stateBoard);
System.out.println(scooter4.plateNumber);
System.out.println(scooter4.tyre);


	}

} 