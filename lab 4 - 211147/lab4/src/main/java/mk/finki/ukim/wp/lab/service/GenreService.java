package mk.finki.ukim.wp.lab.service;

import mk.finki.ukim.wp.lab.model.Album;
import mk.finki.ukim.wp.lab.model.Genre;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface GenreService {
    Optional<Genre> findGenreById(Long id);
    List<Genre> findAll();
//    Genre getGenre(int id);
//    public List<Genre> getAllGenres();
//    Genre addGenre(Genre genre);
}
