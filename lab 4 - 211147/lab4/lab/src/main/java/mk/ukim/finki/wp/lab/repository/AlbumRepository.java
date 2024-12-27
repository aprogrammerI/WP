package mk.ukim.finki.wp.lab.repository;




import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Artist;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {

    public List<Album> findAll(){
        return DataHolder.albums;
    }

    public Album findById(Long id) {
        return DataHolder.albums.stream().filter(album -> album.getId().equals(id)).findFirst().orElse(null);
    }

}
