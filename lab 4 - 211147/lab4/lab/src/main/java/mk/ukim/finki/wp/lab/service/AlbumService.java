package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Album;

import java.util.*;

public interface AlbumService {
    public List<Album> findAll();
    Album findById(Long id);
}
