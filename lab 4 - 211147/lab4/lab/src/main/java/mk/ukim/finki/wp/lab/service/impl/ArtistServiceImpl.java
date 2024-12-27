package mk.ukim.finki.wp.lab.service.impl;

import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.repository.ArtistRepository;
import mk.ukim.finki.wp.lab.service.ArtistService;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> listArtists() {
        return this.artistRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return this.artistRepository.findById(id);
    }

    public Song findSongFromArtist(String firstName){
        return DataHolder.songs.stream().filter(i->i.getPerformers().contains(firstName)).findFirst().orElse(null);
    }

    public List<Song> listSongsForArtist(Optional artist) {
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
