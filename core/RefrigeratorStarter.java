class RefrigeratorStarter{
public static void main(String[] values){

Refrigerator refrigerator1 = new Refrigerator();

refrigerator1.setModel("New");
refrigerator1.setCompany("HP");
refrigerator1.setCapacity(8.f);
refrigerator1.setDoubleDoor(false);

String model = refrigerator1.getModel();
String company = refrigerator1.getCompany();
float capacity = refrigerator1.getCapacity();
boolean doubleDoor = refrigerator1.getDoubleDoor();

if(model!=null){
System.out.println("The model is "+model);
}
if(company!=null){
System.out.println("The company is "+company);
}
if(capacity>0){
System.out.println("The capacity is "+capacity);
}
else{
System.out.println("The capacity should be positive number");
}
if(doubleDoor!=false){
System.out.println("The doubleDoor is "+doubleDoor);
}
else{
	System.out.println("It is a single door refrigerator");

}


}
}