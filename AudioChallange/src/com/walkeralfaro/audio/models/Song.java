package com.walkeralfaro.audio.models;

public class Song extends Audio {

    private String artist;
    private String album;
    private String genre;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //*********** Methods *******************

    @Override
    public int getRating() {
        if (getLikes() > 5000) {
            return 8;
        } else {
            return 4;
        }
    }

    public void songSheet() {
        System.out.println("Song name: " + getTitle());
        System.out.println("Song artist: " + getArtist());
        System.out.println("Song album: " + getAlbum());
        System.out.println("Song likes: " + getLikes());
        System.out.println("Song reproductions: " + getTotalReproductions());
        System.out.println("Song rating: " + getRating());
    }
}
