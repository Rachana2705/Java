class HeadSetRunner{
public static void main(String[] values){
String brand = "sony";
float price = 3197f;
String type = "earbuds";
boolean noisecancellation = true;
boolean mic = true;

new HeadSet();
new HeadSet("samsung");
new HeadSet(price);
new HeadSet(false);
new HeadSet(brand,3500);
new HeadSet(brand,type);
new HeadSet(type,mic);
new HeadSet(brand,4569,false);
new HeadSet(brand,price,"wireless",mic);
new HeadSet(brand,price,type,noisecancellation,mic);
}
}