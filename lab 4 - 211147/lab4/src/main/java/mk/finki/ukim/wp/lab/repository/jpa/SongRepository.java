package mk.finki.ukim.wp.lab.repository.jpa;

import mk.finki.ukim.wp.lab.model.Artist;
import mk.finki.ukim.wp.lab.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    List<Song> findAllByAlbum_Id(Long albumId);

    @Query("SELECT s FROM Song s JOIN s.performers a WHERE a.firstName = :firstName AND a.lastName = :lastName")
    List<Song> findSongsByArtistName(@Param("firstName") String firstName, @Param("lastName") String lastName);

}
