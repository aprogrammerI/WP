package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Artist> artists = new ArrayList<>();
    public static List<Song> songs = new ArrayList<>();
    public static List<Album> albums = new ArrayList<>();

    @PostConstruct
    public void init(){

        artists.add(new Artist("Namjoon", "Kim", "returning in 219 days"));
        artists.add(new Artist("Seokjin", "Kim", "ALREADY BACK!!"));
        artists.add(new Artist("Yoongi", "Min", "returning in 230 days"));
        artists.add(new Artist("Hoseok", "Jung", "ALREADY BACK!!"));
        artists.add(new Artist("Jimin", "Park", "returning in 220 days"));
        artists.add(new Artist("Taehyung", "Kim", "returning in 219 days"));
        artists.add(new Artist("Jungkook", "Jeon", "returning in 220 days"));

        List<Artist> performer1 = new ArrayList<>();
        performer1.add(artists.get(0));

        List<Artist> performer2 = new ArrayList<>();
        performer2.add(artists.get(1));

        List<Artist> performer3 = new ArrayList<>();
        performer3.add(artists.get(2));

        List<Artist> performer4 = new ArrayList<>();
        performer4.add(artists.get(3));

        List<Artist> performer5 = new ArrayList<>();
        performer5.add(artists.get(4));

        List<Artist> performer6 = new ArrayList<>();
        performer6.add(artists.get(5));

        List<Artist> performer7 = new ArrayList<>();
        performer7.add(artists.get(6));

        albums.add(new Album("Right Place, Wrong Person", "HipHop", "2024"));
        albums.add(new Album("Happy", "Pop", "2024"));
        albums.add(new Album("D-Day", "Rap", "2023"));
        albums.add(new Album("Hope On The Street", "HipHop", "2023"));
        albums.add(new Album("Muse", "Park", "2024"));
        albums.add(new Album("Layover", "R&B", "2023"));
        albums.add(new Album("Golden", "Pop", "2023"));


        songs.add(new Song("19940912", "LOST", "HipHop", 2024, performer1, albums.get(0)));
        songs.add(new Song("19912204", "I'll be there", "Pop", 2024, performer2, albums.get(1)));
        songs.add(new Song("19930309", "Haegeum", "Rap", 2023, performer3, albums.get(2)));
        songs.add(new Song("19940218", "Neuron", "HipHop", 2024, performer4, albums.get(3)));
        songs.add(new Song("19951013", "Who", "Pop", 2024, performer5, albums.get(4)));
        songs.add(new Song("19951230", "Rainy Days", "R&B", 2023, performer6, albums.get(5)));
        songs.add(new Song("19970901", "Standing next to you", "Pop", 2023, performer7, albums.get(6)));

        artists.get(0).setSongs("LOST");
        artists.get(1).setSongs("I'll be there");
        artists.get(2).setSongs("Haegeum");
        artists.get(3).setSongs("Neuron");
        artists.get(4).setSongs("Who");
        artists.get(5).setSongs("Rainy Days");
        artists.get(6).setSongs("Standing next to you");
    }

}
