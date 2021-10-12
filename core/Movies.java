class Movies{
String movieName;
float duration = 2.45f;
MoviesGenre genre;
String story;
float expense;

Movies(){
System.out.println("Invoked no-arg constructor");
}

Movies(String movieName,MoviesGenre genre){
System.out.println("Invoked movieName and genre constructor");
this.movieName = movieName;
this.genre = genre;
}

Movies(String movieName,float duration,float expense){
System.out.println("Invoked movieName and duration constructor");
this.movieName = movieName;
this.duration= duration;
this.expense = expense;
}

Movies(String story,float expense){
this("Rajakumara",MoviesGenre.DRAMA);
System.out.println("Invoked story and expense constructor");
this.story= story;
this.expense = expense;

}

}