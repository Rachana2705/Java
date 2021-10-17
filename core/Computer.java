class Computer{

String brand = "Dell";
String modelNo;
float price;
int quantity;
static double totalOfAll;
ComputerType type;
Computer(){
System.out.println("Invoked no-arg Constructor");
}

void displayDetails(){
System.out.println(this.brand);
System.out.println(this.modelNo);
System.out.println(this.price);
System.out.println(this.quantity);
}

void displayTotalPrice(){
double totalPrice;
totalPrice = this.quantity * this.price;
System.out.println("The price of "+this.brand+" is "+totalPrice);
totalOfAll = totalOfAll + totalPrice;
}

void displayTotalOfAllPrice(){
System.out.println("The total price is "+totalOfAll);
}

}