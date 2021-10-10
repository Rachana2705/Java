class ClimateRunner{
public static void main(String[] values){
float temp = 35f;
float humidity = 40f;
String climatetype = "summer";
String location = "bengaluru";
String description = "It is a hot day";

new Climate();
new Climate(temp);
new Climate(temp,humidity);
new Climate(37,climatetype);
new Climate(40,humidity,climatetype);
new Climate(location,temp);
new Climate(location,"winter");
new Climate(location,climatetype,description);
new Climate(38,location,climatetype,description);
new Climate(temp,humidity,climatetype,location,description);
}
}