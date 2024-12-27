package mk.finki.ukim.wp.lab.service;

import mk.finki.ukim.wp.lab.model.Artist;
import mk.finki.ukim.wp.lab.model.Song;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SongService{
    List<Song> listSongs();
    Artist addArtistToSong(Artist artist, Song song);
    Song findById(Long id);

    void save(Song song);
    void delete(Long id);

    List<Song> findAllByAlbum_Id(Long albumId);
    List<Song> findSongsByArtistName(@Param("firstName") String firstName, @Param("lastName") String lastName);
}