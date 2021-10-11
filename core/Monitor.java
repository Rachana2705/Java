class Monitor 
{
String brand;
float price = 15000f;
String color="White";
float inches;
int supplyVolt;
String device;
String purchaseMode;
int warranty = 2;
String shape;
float bandWidth;
String model;
int resolution;
int frequency;
String use;
float weight;

Monitor(){
	System.out.println("Invoked no-argument constructor");
}

Monitor(String ref_brand,float ref_price,String ref_color){
	System.out.println("Invoked brand, price, and color Constructor");
	this.brand = ref_brand;
	this.price = ref_price;
	this.color = ref_color;
}

Monitor(float ref_inches, int ref_supplyVolt, String ref_device){
	System.out.println("Invoked inches,supplyvolt and device Constructor");
	this.inches = ref_inches;
	this.supplyVolt = ref_supplyVolt;
	this.device = ref_device;
}

Monitor(String ref_purchaseMode, int ref_warranty, String ref_shape){
	System.out.println("Invoked purchaseMode, warranty and shape Constructor");
	this.purchaseMode = ref_purchaseMode;
	this.warranty = ref_warranty;
	this.shape = ref_shape;
}

Monitor(float ref_bandWidth, String ref_model, int ref_resolution){
	System.out.println("Invoked bandWidth, model, and resolution Constructor");
	this.bandWidth = ref_bandWidth;
	this.model = ref_model;
	this.resolution = ref_resolution;
}

Monitor(int ref_frequency, String ref_use, float ref_weight){
	System.out.println("Invoked frequency,use, and weight Constructor");
	this.frequency = ref_frequency;
	this.use = ref_use;
	this.weight = ref_weight;
}


}