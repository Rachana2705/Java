class CameraStarter{
public static void main(String[] pictures){

Camera camera1 = new Camera();

camera1.setBrand("Leica");
camera1.setModel("New");
camera1.setPixels(1087);
camera1.setPrice(2000f);
camera1.setQuality(false);

String brand = camera1.getBrand();
String model = camera1.getModel();
int pixels = camera1.getPixels();
float price = camera1.getPrice();
boolean quality = camera1.getQuality();

if(brand!=null){
System.out.println("The brand is "+brand);
}
if(model!=null){
System.out.println("The model is "+model);
}
if(pixels>0){
System.out.println("The pixels is "+pixels);
}
if(price>0){
System.out.println("The price is "+price);
}
else{
System.out.println("The price should be positive number");
}
if(quality!=false){
System.out.println("The quality is "+quality);
}
else{
	System.out.println("The quality is not upto the mark");

}


}
}