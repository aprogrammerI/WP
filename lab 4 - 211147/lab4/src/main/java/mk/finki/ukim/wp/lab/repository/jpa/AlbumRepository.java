package mk.finki.ukim.wp.lab.repository.jpa;


import mk.finki.ukim.wp.lab.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {

}
