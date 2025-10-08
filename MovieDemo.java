//Main class
public class MovieDemo {
    public static void main(String[] args) {

        Movie m1 = new Movie("Hello", "XYZ Productions");
        System.out.println(m1.getMovieId()); // Output: Hello_1


        Movie m2 = new Movie("Avengers", "Marvel Studios", "Joss Whedon", 2.5, 2012, "Action");
        m2.displayInfo();
        System.out.println("Total Movies: " + Movie.getMoviesCount());


        SpecialMovie sm = new SpecialMovie("Inception", "Warner Bros", "Christopher Nolan", 2.8, 2010, "Sci-Fi",
                "Dolby Atmos", "IMAX");
        System.out.println("\nSpecial Movie Details:");
        System.out.println(sm.showDetails());


        InternationalMovie im = new InternationalMovie("Parasite", "Barunson E&A", "Bong Joon-ho", 2.1, 2019, "Thriller",
                "South Korea", "Korean");
        System.out.println("\nInternational Movie Details:");
        System.out.println(im.showDetails());


        System.out.println("\nTotal Movies Created: " + Movie.getMoviesCount());
    }
}
