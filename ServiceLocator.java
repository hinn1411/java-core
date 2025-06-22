class MoviesLister {
    MoviesFinder finder = MoviesServiceLocator.moviesFinder();
}

class MoviesFinder {

}



class MoviesServiceLocator {
    private static MoviesServiceLocator soleInstance;
    private MoviesFinder moviesFinder;

    public  MoviesServiceLocator (MoviesFinder moviesFinder) {
        this.moviesFinder = moviesFinder;
    }

    public static MoviesFinder moviesFinder() {
        return soleInstance.moviesFinder;
    }

    public static void load(MoviesServiceLocator arg) {
        soleInstance = arg;
    }
}

class Tester {
    private void configure() {
        MoviesServiceLocator.load(new MoviesServiceLocator(new MoviesFinder()));
    }
}

public class ServiceLocator {
    public static void main(String[] args ) {

    }
}
