class Scooter
{
String brand;
float price;
String color="Black";
float length;
double weight;
float mileage  = 75.f;
String type;
String seatColor = "brown";
String model;
float fuelTank;
boolean insurance;
float speed;
String stateBoard;
int plateNumber;
String tyre;


Scooter(){
	System.out.println("location with no arguments");
}

Scooter(float ref_price,String ref_brand){
    System.out.println("invoking price and brand Constructor");
	this.price = ref_price;
	this.brand = ref_brand;
}

Scooter(String color,String seatColor){
    System.out.println("invoking color and seat color");
	 this.color=color;
	 this.seatColor=seatColor;
}

Scooter(double weight,float mileage,String type){
    System.out.println("invoke weight, milage and type constructor");
	 this.weight=weight;
	 this.mileage=mileage;
	 this.type=type;
}

Scooter(String model,float fuelTank,boolean insurance){
    System.out.println("invoke model, fuelTank and insurance constructor");
	 this.model=model;
	 this.fuelTank=fuelTank;
	 this.insurance=insurance;
}

Scooter(float length,float speed,String stateBoard,int plateNumber,String tyre){
    System.out.println("invoke length, speed, stateBoard, plateNumber and tyre constructor");
	this.length=length;
	this.speed=speed;
	this.stateBoard=stateBoard;
	this.plateNumber=plateNumber;
	this.tyre=tyre;
}


}