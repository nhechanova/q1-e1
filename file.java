public class Movies {
  // declaration of variables
  String movieName;
  String movieDirector;
  float imdbRating;

  // constructor
  public Movies(String movieName, String movieDirector, float imdbRating) {
    this.movieName = movieName;
    this.movieDirector = movieDirector;
    this.imdbRating = imdbRating;
  }

  // call the constructor
  public static void main(String[] args) {
    Movies firstMovie = new Movies("Grave of the Fireflies", "Isao Takahata", 8.5f);
    Movies secondMovie = new Movies("Autumn Sonata", "Ingmar Bergman", 8.1f);
    Movies thirdMovie = new Movies("All That Jazz", "Bob Fosse", 7.8f);

    displayMovies(firstMovie);
    displayMovies(secondMovie);
    displayMovies(thirdMovie);

    // print
    float avgImdbRating = (firstMovie.imdbRating + secondMovie.imdbRating + thirdMovie.imdbRating) / 3;
    System.out.println("Average IMDb Rating: " + avgImdbRating);
    System.out.println(firstMovie.movieName + " has a higher rating on IMDb than " + thirdMovie.movieName + ": " + (firstMovie.imdbRating > thirdMovie.imdbRating));
    System.out.println("All three movies have a rating of 8.0 or better: " + (firstMovie.imdbRating >= 8.0 && secondMovie.imdbRating >= 8.0 && thirdMovie.imdbRating >= 8.0));
  }
  public static void displayMovies(Movies movie) {
    System.out.printf("Movie Name: %s%nDirector: %s%nIMDb Rating: %.1f%n%n",
                     movie.movieName, movie.movieDirector, movie.imdbRating);
  }
}
