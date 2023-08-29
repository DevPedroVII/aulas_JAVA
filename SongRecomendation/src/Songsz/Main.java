package Songsz;

public class Main {
    public static void main(String[] args) {
        PlaylistRecommender recommender = new PlaylistRecommender();

        String mood = "happy";  // Pode ser "happy", "relax" ou "energetic"
        Playlist recommendedPlaylist = recommender.recommendPlaylist(mood);

        System.out.println("Recomendo a playlist: " + recommendedPlaylist.getName());
        System.out.println("Link: " + recommendedPlaylist.getLink());
    }
}
