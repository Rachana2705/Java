class NewsPaperStarter{
public static void main(String[] value){

String headline = "Today 12th October, rain is expected in the evening";


new NewsPaper();

NewsPaper newspaper1 = new NewsPaper("Deccan Herald");
System.out.println(newspaper1.name);

NewsPaper newspaper2 = new NewsPaper(4f);
System.out.println(newspaper2.price);

NewsPaper newspaper3 = new NewsPaper("Vijaya Karnataka",NewsPaperLang.KANNADA,headline);
System.out.println(newspaper3.name);
System.out.println(newspaper3.lang);
System.out.println(newspaper3.headline);

NewsPaper newspaper4 = new NewsPaper(20,4f);
System.out.println(newspaper4.name);
System.out.println(newspaper4.lang);
System.out.println(newspaper4.headline);
System.out.println(newspaper4.noOfPages);
System.out.println(newspaper4.price);

}
}