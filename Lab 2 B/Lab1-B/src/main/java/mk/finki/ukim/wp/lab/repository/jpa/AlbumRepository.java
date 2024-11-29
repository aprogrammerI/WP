package mk.finki.ukim.wp.lab.repository.jpa;


import mk.finki.ukim.wp.lab.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
}
