package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SongRepository {

    public List<Song> findAll(){
        return DataHolder.songs;
    }

    public Song findById(Long id){
        return DataHolder.songs.stream().filter(i->i.getId().equals(id)).findFirst().get();
    }

    public Artist addArtistToSong(Artist artist, Song song){
        if(artist!=null && song!=null){
            song.getPerformers().add(artist);
        }
        return artist;
    }

    public Song deleteById(Long id){
        Song song = DataHolder.songs.stream().filter(i->i.getId().equals(id)).findFirst().get();
        DataHolder.songs.remove(song);
        return song;
    }

    public void save(Song song) {
        DataHolder.songs.add(song);
    }
}
