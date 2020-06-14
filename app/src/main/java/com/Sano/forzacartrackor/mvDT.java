package com.Sano.forzacartrackor;

public class mvDT {
    String movieTitle,movieRD,movieRating,movieStoryLine;
    int moviePosterPath;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieRD() {
        return movieRD;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public String getMovieStoryLine() {
        return movieStoryLine;
    }

    public int getMoviePosterPath() {
        return moviePosterPath;
    }

    public mvDT(String movieTitle, String movieRD, String movieRating, String movieStoryLine, int moviePosterPath) {
        this.movieTitle = movieTitle;
        this.movieRD = movieRD;
        this.movieRating = movieRating;
        this.movieStoryLine = movieStoryLine;
        this.moviePosterPath = moviePosterPath;
    }
}
