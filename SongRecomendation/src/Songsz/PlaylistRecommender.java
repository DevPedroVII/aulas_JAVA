package Songsz;

import java.util.HashMap;

public class PlaylistRecommender {
    private HashMap<String, Playlist> playlistMap;

    public PlaylistRecommender() {
        playlistMap = new HashMap<>();
        playlistMap.put("happy", new Playlist("Happy Playlist", "https://open.spotify.com/playlist/5d9HYaTGG43g7lcM4OWbOo?si=4a81c6f7848a41df"));
        playlistMap.put("relax", new Playlist("Relax Playlist", "https://open.spotify.com/playlist/0PgL3wDQXG93nGYFdyHKjd?si=525b51b2b5414274"));
        playlistMap.put("energetic", new Playlist("Energetic Playlist", "https://open.spotify.com/playlist/6mKmX3nPHjgCqyCqBhrHRu?si=302009f39ee34201"));
    }

    public Playlist recommendPlaylist(String mood) {
        return playlistMap.getOrDefault(mood.toLowerCase(), new Playlist("Default Playlist", "https://www.spotify.com/defaultplaylist"));
    }
}

