package Movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");

        Movie[] movies = MoviesArray.findAll();

        Input input = new Input(); // create an instance of the Input class

        boolean exit = false;
        while (!exit) {
            System.out.print("\nEnter your choice: ");
            int choice = input.getInt(0, 5); // use the input object to get user input
            switch (choice) {
                case 0:
                    System.out.println("Goodbye!");
                    exit = true;
                    break;
                case 1:
                    displayMovies(movies);
                    break;
                case 2:
                    displayMoviesByCategory(movies, "animated");
                    break;
                case 3:
                    displayMoviesByCategory(movies, "drama");
                    break;
                case 4:
                    displayMoviesByCategory(movies, "horror");
                    break;
                case 5:
                    displayMoviesByCategory(movies, "scifi");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void displayMovies(Movie[] movies) {
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    public static void displayMoviesByCategory(Movie[] movies, String category) {
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }
}
