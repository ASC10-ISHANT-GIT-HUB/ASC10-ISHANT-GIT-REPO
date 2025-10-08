// Main Movie class
public class Movie {
    private String movieName;
    private String producedBy;
    private String directedBy;
    private double duration;
    private int year;
    private String category;

    private final String movieId;
    private static int moviesCount = 0;

    // Constructor with mandatory fields
    public Movie(String movieName, String producedBy) {
        if (movieName == null || producedBy == null) {
            throw new IllegalArgumentException("movieName and producedBy are required.");
        }
        this.movieName = movieName;
        this.producedBy = producedBy;

        moviesCount++;
        this.movieId = movieName + "_" + moviesCount;
    }


    public Movie(String movieName, String producedBy, String directedBy, double duration, int year, String category) {
        this(movieName, producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    public void setDirectedBy(String directedBy) {
        this.directedBy = directedBy;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public void displayInfo() {
        System.out.println(showDetails());
    }


    public String getMovieId() {
        return movieId;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    public String showDetails() {
        return "Movie ID: " + movieId +
                "\nName: " + movieName +
                "\nProduced By: " + producedBy +
                "\nDirected By: " + directedBy +
                "\nDuration: " + duration + " hours" +
                "\nYear: " + year +
                "\nCategory: " + category;
    }
}

// Subclass:Special Movie
class SpecialMovie extends Movie {
    private String soundEffectsTechnology;
    private String visualEffectsTechnology;

    // Constructor using super()
    public SpecialMovie(String movieName, String producedBy, String directedBy, double duration, int year, String category,
                        String soundEffectsTechnology, String visualEffectsTechnology) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.soundEffectsTechnology = soundEffectsTechnology;
        this.visualEffectsTechnology = visualEffectsTechnology;
    }


    @Override
    public String showDetails() {
        return super.showDetails() +
                "\nSound Effects: " + soundEffectsTechnology +
                "\nVisual Effects: " + visualEffectsTechnology;
    }
}

// SubclassL: International movie
class InternationalMovie extends Movie {
    private String country;
    private String language;


    public InternationalMovie(String movieName, String producedBy, String directedBy, double duration, int year, String category,
                              String country, String language) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.country = country;
        this.language = language;
    }


    @Override
    public String showDetails() {
        return super.showDetails() +
                "\nCountry: " + country +
                "\nLanguage: " + language;
    }
}


