class Camera{

String brand= "Nikon";
String model;
int pixels;
float price;
boolean quality;

Camera(){
this("Olympus",3000f);
System.out.println("Invoked no-arg Constructor");
}

Camera(String brand,float price){
System.out.println("Invoked brand and price Constructor");
this.brand= brand;
this.price = price;
}

void setBrand(String brand){
this.brand = brand;
}

void setModel(String model){
this.model = model;
}

void setPixels(int pixels){
this.pixels = pixels;
}

void setPrice(float price){
this.price = price;
}

void setQuality(boolean quality){
this.quality = quality;
}

String getBrand(){
return this.brand;
}

String getModel(){
return this.model;
}

int getPixels(){
return this.pixels;
}

float getPrice(){
return this.price;
}

boolean getQuality(){
return this.quality;
}





}