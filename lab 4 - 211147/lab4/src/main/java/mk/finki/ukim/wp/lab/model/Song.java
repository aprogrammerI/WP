package mk.finki.ukim.wp.lab.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;

    @ManyToOne
    private Genre genre;

    int releaseYear;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Artist> performers;

    @ManyToOne
    private Album album;

    public Song(String title, Genre genre, int releaseYear, List<Artist> performers) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.performers = performers;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setPerformers(List<Artist> performers) {
        this.performers = performers;
    }
}
