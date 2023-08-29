package Songsz;

public class Playlist {
    private String name;
    private String link;

    public Playlist(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }
}
