package com.walkeralfaro.audio.models;

public class Favorite {
    public void add(Audio audio) {
        if (audio.getRating() > 7) {
            System.out.println(audio.getTitle() + " Es uno de los favoritos del momento");
        } else {
            System.out.println(audio.getTitle() + " También es un favorito");
        }
    }
}
