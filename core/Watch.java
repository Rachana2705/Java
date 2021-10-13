class Watch{
String countryMade;
WatchType type;

Watch(){
this("India",WatchType.DIGITAL);
}

Watch(String countryMade,WatchType type){
this.countryMade = countryMade;
this.type = type;
}

void displayDetails(){
System.out.println(countryMade);
System.out.println(type);
}
}