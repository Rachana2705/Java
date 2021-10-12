class MoviesStarter{
public static void main(String[] values){

String story = "this is the story about a boy ...";
MoviesGenre genre = MoviesGenre.ANIMATION;
new Movies();
Movies movies1 = new Movies("Up",MoviesGenre.ANIMATION);
System.out.println(movies1.movieName);
System.out.println(movies1.genre);


Movies movies2 = new Movies("Green Book",2.30f,376f);
System.out.println(movies2.movieName);
System.out.println(movies2.duration);
System.out.println(movies2.expense);

Movies movies3 = new Movies(story,20000f);
System.out.println(movies3.expense);
System.out.println(movies3.movieName);
System.out.println(movies3.genre);
System.out.println(movies3.story);


}
} 