package Songsz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Recommender de Playlists!");
        System.out.print("Que tipo de música você gostaria de ouvir? (Happy/Relax/Energetic) ");
        String mood = scanner.nextLine();

        PlaylistRecommender recommender = new PlaylistRecommender();
        Playlist recommendedPlaylist = recommender.recommendPlaylist(mood);

        System.out.println("Recomendo a playlist: " + recommendedPlaylist.getName());
        System.out.println("Link: " + recommendedPlaylist.getLink());

        scanner.close();
    }
}
