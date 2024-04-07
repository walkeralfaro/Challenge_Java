package com.walkeralfaro.audio.main;
import com.walkeralfaro.audio.models.Favorite;
import com.walkeralfaro.audio.models.Podcast;
import com.walkeralfaro.audio.models.Song;

public class Main {
    public static void main(String[] args) {

        Song song1 = new Song();
        Podcast podcast1 = new Podcast();

        song1.setTitle("Dead");
        song1.setAlbum("Issues");
        song1.setArtist("Korn");
        song1.setGenre("nuMetal");
        song1.setRating(10);

        for (int i = 0; i < 6000; i++) {
            song1.doLike();
        }

        for (int i = 0; i < 21845; i++) {
            song1.plays();
        }

        song1.songSheet();

        Favorite favorite = new Favorite();
        favorite.add(song1);




    }
}
