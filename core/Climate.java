class Climate{
float temp;
float humidity;
String climatetype;
String location;
String description;

Climate(){
System.out.println("Invoked default Constructor");
}

Climate(float ref_temp){
System.out.println("Invoked temperature Constructor");
}

Climate(float ref_temp,float ref_humidity){
System.out.println("Invoked temperature and humidity Constructor");
}

Climate(float ref_temp,String climatetype){
System.out.println("Invoked temperature and climatetype Constructor");
}

Climate(float ref_temp,float ref_humidity,String ref_climatetype){
System.out.println("Invoked temperature, humidity and climatetype Constructor");
}

Climate(String ref_location,float ref_temp){
System.out.println("Invoked location and temperature Constructor");
}

Climate(String ref_location,String ref_climatetype){
System.out.println("Invoked location and climatetype Constructor");
}

Climate(String ref_location,String ref_climatetype,String ref_description){
System.out.println("Invoked location, climatetype and description Constructor");
}

Climate(float ref_temp,String ref_location,String ref_climatetype,String ref_description){
System.out.println("Invoked temperature, location, climatetype and description Constructor");
}

Climate(float ref_temp,float ref_humidity,String ref_climatetype,String ref_location,String ref_description){
System.out.println("Invoked temperature,humidity, location, climatetype and description Constructor");
}





}