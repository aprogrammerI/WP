package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;

import java.util.List;
import java.util.Optional;

public interface ArtistService{
    List<Artist> listArtists();
    Optional findById(Long id);
    Song findSongFromArtist(String firstName);
    public List<Song> listSongsForArtist(Optional artist);
    public Song addSongToArtist(Artist artist, Song song);
}
