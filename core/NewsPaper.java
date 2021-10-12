class NewsPaper{
String name;
NewsPaperLang lang;
int noOfPages;
float price;
String headline;

NewsPaper(){
System.out.println("Invoked no-arg constructor");
}

NewsPaper(String name){
System.out.println("Invoked name constructor");
this.name = name;
}

NewsPaper(float price){
System.out.println("Invoked price constructor");
this.price = price;
}

NewsPaper(String name,NewsPaperLang lang,String headline){
System.out.println("Invoked name,language and headline constructor");
this.name = name;
this.lang = lang;
this.headline = headline;
}

NewsPaper(int noOfPages,float price){
this("The Hindu",NewsPaperLang.ENGLISH,"Breaking News");
System.out.println("Invoked noOfPages and price constructor");
this.noOfPages = noOfPages;
this.price = price;
}

}