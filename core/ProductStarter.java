class ProductStarter{
public static void main(String[] values){

Product product = new Product();
product.displayDetails();
product.displayPrice();

Product product1 = new Product();
product1.name = "TV";
product1.price = 25.f;
product1.quality = true;
product1.quantity = 8;
product1.isiMark = true;
product1.displayDetails();
product1.displayPrice();

Product product2 = new Product();
product2.name = "Mobile";
product2.price = 15.f;
product2.quality = true;
product2.quantity = 20;
product2.isiMark = true;
product2.displayDetails();
product2.displayPrice();

Product product3 = new Product();
product3.name = "Laptop";
product3.price = 30.f;
product3.quality = true;
product3.quantity = 6;
product3.isiMark = true;
product3.displayDetails();
product3.displayPrice();

Product product4 = new Product();
product4.name = "EarPhone";
product4.price = 5.f;
product4.quality = true;
product4.quantity = 2;
product4.isiMark = false;
product4.displayDetails();
product4.displayPrice();

Product product5 = new Product();
product5.name = "Charger";
product5.price = 4.f;
product5.quality = false;
product5.quantity = 10;
product5.isiMark = true;
product5.displayDetails();
product5.displayPrice();
}
}