package assignments.Three;

/**
 * This is the third assignment [Movie]
 * 
 * @version 1.0
 * @since 2024-06-03
 */
public class Movie {
    private String title;
    private String studio;
    private String rating;

    // Constructor that sets the title, studio, and rating
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    // Constructor that sets the title and studio, and defaults the rating to "PG"
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    // Method to get an array of movies with a rating of "PG"
    public static Movie[] getPG(Movie[] movies) {
        // Determine the number of PG movies
        int count = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                count++;
            }
        }

        // Create an array to hold the PG movies
        // Since the arrays in java are fixed size, we need to know the size of the
        // array before creating it ~_*
        Movie[] pgMovies = new Movie[count];
        int index = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                pgMovies[index++] = movie;
            }
        }

        return pgMovies;
    }

    public static void main(String[] args) {
        // Create an instance of the class Movie with the title "Casino Royale", the
        // studio "Eon Productions", and the rating "PG13"
        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");

        // Create additional Movie instances for testing
        Movie movie1 = new Movie("The Lion King", "Disney", "PG");
        Movie movie2 = new Movie("Avengers: Endgame", "Marvel Studios", "PG13");
        Movie movie3 = new Movie("Finding Nemo", "Pixar", "PG");
        Movie movie4 = new Movie("Inception", "Warner Bros.", "PG13");

        // Array of Movie objects
        Movie[] movies = { casinoRoyale, movie1, movie2, movie3, movie4 };

        // Get an array of movies with a rating of "PG"
        Movie[] pgMovies = Movie.getPG(movies);

        // Output the PG movies
        System.out.println("PG Movies:");
        for (Movie movie : pgMovies) {
            System.out.println(movie.title + " by " + movie.studio);
        }
    }
}
