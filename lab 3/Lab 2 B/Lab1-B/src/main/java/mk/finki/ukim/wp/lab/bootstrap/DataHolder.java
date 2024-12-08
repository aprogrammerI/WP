//package mk.finki.ukim.wp.lab.bootstrap;
//
//
//
//import jakarta.annotation.PostConstruct;
//import mk.finki.ukim.wp.lab.model.Album;
//import mk.finki.ukim.wp.lab.model.Artist;
//import mk.finki.ukim.wp.lab.model.Song;
//import mk.finki.ukim.wp.lab.repository.jpa.AlbumRepository;
//import mk.finki.ukim.wp.lab.repository.jpa.ArtistRepository;
//import mk.finki.ukim.wp.lab.repository.jpa.SongRepository;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Component
//public class DataHolder {
//    public static List<Artist> artistList;
//    public static List<Song> songs;
//    public static List<Album> albums;
//
//    private final SongRepository songRepository;
//    private final ArtistRepository artistRepository;
//    private final AlbumRepository albumRepository;
//
//    public DataHolder(SongRepository songRepository, ArtistRepository artistRepository, AlbumRepository albumRepository) {
//        this.songRepository = songRepository;
//        this.artistRepository = artistRepository;
//        this.albumRepository = albumRepository;
//    }
//
//
//    @PostConstruct
//    public void init() {
//        artistList = new ArrayList<>();
//        artistList.add(new Artist("Artist", "1", "Bio1"));
//        artistList.add(new Artist("Artist", "2", "Bio2"));
//        artistList.add(new Artist("Artist", "3", "Bio3"));
//        artistList.add(new Artist("Artist", "4", "Bio4"));
//        artistList.add(new Artist("Artist", "5", "Bio5"));
//        artistList.add(new Artist("Artist", "6", "Bio6"));
//        artistList.add(new Artist("Artist", "7", "Bio7"));
//
//        if (this.artistRepository.count() == 0) {
//            this.artistRepository.saveAll(artistList);
//        }
//
//        List<Artist> performer1 = new ArrayList<>();
//        performer1.add(artistList.get(0));
//
//        List<Artist> performer2 = new ArrayList<>();
//        performer2.add(artistList.get(1));
//
//        List<Artist> performer3 = new ArrayList<>();
//        performer3.add(artistList.get(2));
//
//        List<Artist> performer4 = new ArrayList<>();
//        performer4.add(artistList.get(3));
//
//        List<Artist> performer5 = new ArrayList<>();
//        performer5.add(artistList.get(4));
//
//        List<Artist> performer6 = new ArrayList<>();
//        performer6.add(artistList.get(5));
//
//        List<Artist> performer7 = new ArrayList<>();
//        performer7.add(artistList.get(6));
//
//        songs = new ArrayList<>();
//        songs.add(new Song("Song1", "HipHop", 2024, performer1));
//        songs.add(new Song("Song2", "Pop", 2024, performer2));
//        songs.add(new Song("Song3", "Rap", 2023, performer3));
//        songs.add(new Song("Song4", "HipHop", 2024, performer4));
//        songs.add(new Song("Song5", "Pop", 2024, performer5));
//        songs.add(new Song("Song6", "R&B", 2023, performer6));
//        songs.add(new Song("Song7", "Pop", 2023, performer7));
//
//
//        albums=new ArrayList<>();
//
//        albums.add(new Album("Album1", "HipHop", "2024"));
//        albums.add(new Album("Album2", "Pop", "2024"));
//        albums.add(new Album("Album3", "Rap", "2023"));
//        albums.add(new Album("Album4", "HipHop", "2023"));
//        albums.add(new Album("Album5", "Park", "2024"));
//        albums.add(new Album("Album6", "R&B", "2023"));
//        albums.add(new Album("Album7", "Pop", "2023"));
//
//        if (this.albumRepository.count() == 0) {
//            this.albumRepository.saveAll(albums);
//        }
//
//
//        for (int i = 0; i < songs.size(); i++) {
//            songs.get(i).setAlbum(albums.get(i));
//        }
//
//
//        if (this.songRepository.count() == 0) {
//            this.songRepository.saveAll(songs);
//        }
//    }
//
//}