package mk.finki.ukim.wp.lab.service.impl;

import mk.finki.ukim.wp.lab.model.Genre;
import mk.finki.ukim.wp.lab.repository.jpa.GenreRepository;
import mk.finki.ukim.wp.lab.service.GenreService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreServiceImpl implements GenreService {
    private GenreRepository genreRepository;

    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public Optional<Genre> findGenreById(Long id) {
        return genreRepository.findById(id);
    }

    @Override
    public List<Genre> findAll() {
        return genreRepository.findAll();
    }
}
