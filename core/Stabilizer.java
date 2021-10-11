class Stabilizer 
{
String brand="V-Guard";
float price=5000.00f;
String colour;
int voltage;
int supplyVolt;
float powerRating;
float ratings;
int amperes;
String appliances;
String purchaseMode;
float powerFactor;
int warranty;
float size;
float efficiency;
float weight;

Stabilizer(){
	System.out.println("location with no arguments");
}

Stabilizer(float cost){
	System.out.println("Invoked cost constructor");
    System.out.println(cost);
	price=cost;
	this.price = cost;
}

Stabilizer(String colour,int voltage,float powerRating){
	System.out.println("Invoked colour,voltage and powerRating constructor");
	 this.colour=colour;
	 this.voltage=voltage;
	 this.powerRating=powerRating;
	 this.ratings=ratings;
}

Stabilizer(int supplyVolt,int amperes,float efficiency,float weight,float powerFactor){
	System.out.println("Invoked supplyVolt, amperes, efficiency, weight and powerFactor constructor");
	 this.supplyVolt=supplyVolt;
	 this.amperes=amperes;
	 this.efficiency=efficiency;
	 this.weight=weight;
	 this.powerFactor=powerFactor;
}

Stabilizer(String appliances,String purchaseMode,int warranty){
	System.out.println("Invoked appliances, purchaseMode and warranty constructor");
	 this.appliances=appliances;
	 this.purchaseMode=purchaseMode;
	 this.warranty=warranty;
}

Stabilizer(float size,String brand,float price){
	System.out.println("Invoked size,brand and price constructor");
	System.out.println(this.size);
	System.out.println(this.brand);
	System.out.println(this.price);
	this.size=size;
	this.brand=brand;
	this.price=price;
}

Stabilizer(float ratings,float powerFactor){
	System.out.println("Invoked ratings, powerFactor constructor");
	this.ratings = ratings;
	this.powerFactor = powerFactor;
}
public String toString()
{
String x="Price="+price;
return x;
}
}



