package com.walkeralfaro.audio.models;

public class Audio {
    private String title;
    private int timeLap;
    private int totalReproductions;
    private int likes;
    private int rating;

    //************* Getters ans Setters *****************

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTimeLap() {
        return timeLap;
    }

    public void setTimeLap(int timeLap) {
        this.timeLap = timeLap;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getLikes() {
        return likes;
    }

    //************** Methods ******************

    public void doLike(){
        this.likes++;
    }

    public void plays() {
        this.totalReproductions++;
    }
}
