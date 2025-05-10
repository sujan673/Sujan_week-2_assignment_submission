//Create a Movie class with attributes: name, language, rating (out of 5). Create a method displayMovieDetails(). In main(), create 4 Movie objects and call displayMovieDetails().


class Movie {
    String name;
    String language;
    double rating;

    Movie(String name, String language, double rating) {
        this.name = name;
        this.language = language;
        this.rating = rating;
    }

    void displayMovieDetails() {
        System.out.println("Movie Name: " + name);
        System.out.println("Language: " + language);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("-------------------------");
    }
}

public class Qn5_medium {
    public static void main(String[] args) {
        Movie m1 = new Movie("Bahubali", "Hindi", 4.8);
        Movie m2 = new Movie("KGF", "Telugu", 4.6);
        Movie m3 = new Movie("Pushpa", "Hindi", 4.9);
        Movie m4 = new Movie("Jhola", "Nepali", 4.5);
        m1.displayMovieDetails();
        m2.displayMovieDetails();
        m3.displayMovieDetails();
        m4.displayMovieDetails();
    }
}