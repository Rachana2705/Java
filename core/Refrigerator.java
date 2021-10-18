class Refrigerator{

String model;
String company;
float capacityInLiters;
boolean doubleDoor;

Refrigerator(){
System.out.println("Invoked default constructor");
}

void setModel(String model){
this.model = model;
}

void setCompany(String company){
this.company = company;
}

void setCapacity(float capacityInLiters){
this.capacityInLiters = capacityInLiters;
}

void setDoubleDoor(boolean doubleDoor){
this.doubleDoor = doubleDoor;
}

String getModel(){
return this.model;
}

String getCompany(){
return this.company;
}

float getCapacity(){
return this.capacityInLiters;
}

boolean getDoubleDoor(){
return this.doubleDoor;
}


}