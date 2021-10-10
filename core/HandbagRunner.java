class HandbagRunner{

public static void main(String[] args){
String color = "Red";
float price = 3500.f;
String brand = "DressBerry";
String size = "Medium";
String material = "Leather";
float capacity = 2.f;

new HandBag();
new HandBag(color);
new HandBag(2000.f);
new HandBag("Blue",price);
new HandBag(null,null);
new HandBag("Green",brand,material);
new HandBag(price,2.05f);
new HandBag(null,null,material,2098.f);
new HandBag(brand,material,capacity);
new HandBag(color,brand,material,price,capacity);



}
}