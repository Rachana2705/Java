class HandBag{
String color;
float price;
String brand;
String size;
String material;
float capacity;

HandBag(){
System.out.println("Invoked Handbag Default Constructor");
}

HandBag(String ref_color){
System.out.println("Invoked Handbag color Constructor");
color = ref_color;
}

HandBag(float ref_price){
System.out.println("Invoked Handbag color Constructor");
price = ref_price;
}


HandBag(String ref_color,float ref_price){
System.out.println("Invoked Handbag color and price Constructor");
color = ref_color;
price = ref_price;
}

HandBag(String ref_brand, String ref_material){
System.out.println("Invoked Handbag brand and material Constructor");
brand = ref_brand;
material = ref_material;
}

HandBag(String ref_color, String ref_brand, String ref_material){
System.out.println("Invoked Handbag color, brand and material Constructor");
color = ref_color;
brand = ref_brand;
material = ref_material;
}

HandBag(float ref_price, float ref_capacity){
System.out.println("Invoked Handbag price and capacity Constructor");
price = ref_price;
capacity = ref_capacity;
}

HandBag(String ref_color, String ref_brand, String ref_material, float ref_price){
System.out.println("Invoked Handbag color, brand, material and price Constructor");
color = ref_color;
brand = ref_brand;
material = ref_material;
price = ref_price;
}

HandBag(String ref_brand, String ref_material, float ref_capacity){
System.out.println("Invoked Handbag color, brand, material and price Constructor");
brand = ref_brand;
material = ref_material;
capacity = ref_capacity;
}

HandBag(String ref_color, String ref_brand, String ref_material, float ref_price, float ref_capacity){
System.out.println("Invoked Handbag price and capacity Constructor");
color = ref_color;
brand = ref_brand;
material = ref_material;
price = ref_price;
capacity = ref_capacity;
}

}