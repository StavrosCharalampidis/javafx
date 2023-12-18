package app;

public class Movies {
    private String MovieTitle;
    private int MovieId;
    private int MovieYearProduction;
    private String MovieActors;
    private int Movieduration;
    
    public Movies(String MovieTitle, int MovieId, int MovieYearProduction, String MovieActors, int Movieduration) {
        this.MovieTitle = MovieTitle;
        this.MovieId = MovieId;
        this.MovieYearProduction = MovieYearProduction;
        this.MovieActors = MovieActors;
        this.Movieduration = Movieduration;
        
    }

    public String getMovieTitle() { 
        return this.MovieTitle;
    }

    public void setMovieTitle(String MovieTitle) {
        this.MovieTitle = MovieTitle;
    }

    
}
