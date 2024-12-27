package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ArtistRepository {

    public List<Artist> findAll(){
        return DataHolder.artists;
    }

    public Optional<Artist> findById(Long id){
        return DataHolder.artists.stream().filter(artist -> artist.getId().equals(id)).findFirst();
    }

    public List<Song> listSongsForArtist(Artist artist) {
        return DataHolder.songs.stream()
                .filter(song -> song.getPerformers().contains(artist))
                .collect(Collectors.toList());
    }

    public Song addSongToArtist(Artist artist, Song song){
        if(artist!=null && song!=null){
            artist.getSongs().add(song.getTitle());
        }
        return song;
    }

}
