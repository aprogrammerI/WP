package mk.ukim.finki.wp.lab.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Artist {

    Long id;
    String firstName;
    String lastName;
    String bio;
    List<String> songs;

    public Artist(String firstName, String lastName, String bio) {
        this.id = (long) (Math.random() * 10000);
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.songs = new ArrayList<String>();
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(String songs) {
        this.songs.add(songs);
    }
}
