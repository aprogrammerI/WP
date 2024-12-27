package mk.ukim.finki.wp.lab.model;



import lombok.Data;

import java.util.List;

@Data
public class Album{
    private Long id;
    private String name;
    private String genre;
    private String releaseYear;


    public Album(String name, String genre, String releaseYear) {
        this.id = (long) (Math.random() * 10000);
        this.name = name;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

//    @OneToMany
//    private List<Song> songs;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
}
