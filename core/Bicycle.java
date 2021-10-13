class Bicycle{
String color;
float price;
String brand;
BicycleType type;

Bicycle(){
System.out.println("invoked no-arg constructor");
}

Bicycle(String color,float price){
this("Hero",BicycleType.MOUNTAIN);
System.out.println("Invoked color and price Constructor");
this.color = color;
this.price = price;
}

Bicycle(String brand,BicycleType type){
System.out.println("Invoked brand and type Constructor");
this.brand = brand;
this.type = type;
}

void brake(){
System.out.println("Invoked brake instance method");
}

void move(){
System.out.println("Invoked move instance method");
}

void displayDetails(){
System.out.println(brand);
System.out.println(color);
System.out.println(type);
System.out.println(price);
}

}