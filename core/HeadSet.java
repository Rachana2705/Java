class HeadSet{
String brand;
float price;
String type;
boolean noisecancellation;
boolean mic;

HeadSet(){
System.out.println("Invoked Default Constructor");
}

HeadSet(String ref_brand){
System.out.println("Invoked brand Constructor");
}

HeadSet(float ref_price){
System.out.println("Invoked price Constructor");
}

HeadSet(boolean ref_noisecancellation){
System.out.println("Invoked noisecancellation Constructor");
}

HeadSet(String ref_brand,float ref_price){
System.out.println("Invoked brand and price Constructor");
}

HeadSet(String ref_brand,String ref_type){
System.out.println("Invoked brand and type Constructor");
}

HeadSet(String ref_type,boolean ref_mic){
System.out.println("Invoked type and mic Constructor");
}

HeadSet(String ref_brand,float ref_price,boolean ref_mic){
System.out.println("Invoked brand, price and mic Constructor");
}

HeadSet(String ref_brand,float ref_price,String ref_type, boolean ref_mic){
System.out.println("Invoked brand, price, type and mic Constructor");
}

HeadSet(String ref_brand,float ref_price,String ref_type,boolean ref_noisecancellation, boolean ref_mic){
System.out.println("Invoked brand, price, type, noisecancellation and mic Constructor");
}

}