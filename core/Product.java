class Product{
boolean quality;
float price;
int quantity;
boolean isiMark;
String name;
static double totalOfAllProducts=0;

Product(){
System.out.println("Invoked no-arg Constructor");
}

void displayDetails(){
System.out.println(this.name);
System.out.println(this.price);
System.out.println(this.quality);
System.out.println(this.quantity);
System.out.println(this.isiMark);
}

void displayPrice(){
double totalPrice = this.price * this.quantity;
System.out.println("Price of "+this.name+" is "+totalPrice);
Product.totalOfAllProducts = totalOfAllProducts + totalPrice;
System.out.println("Total Price of all the products is "+totalOfAllProducts);
}

}