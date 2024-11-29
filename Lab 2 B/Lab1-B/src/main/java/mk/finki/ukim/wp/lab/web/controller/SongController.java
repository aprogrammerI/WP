package mk.finki.ukim.wp.lab.web.controller;

import mk.finki.ukim.wp.lab.model.Album;
import mk.finki.ukim.wp.lab.model.Song;
import mk.finki.ukim.wp.lab.service.AlbumService;
import mk.finki.ukim.wp.lab.service.SongService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/songs")
public class SongController {
    private final SongService songService;
    private final AlbumService albumService;

    public SongController(SongService songService, AlbumService albumService) {
        this.songService = songService;
        this.albumService = albumService;
    }

    @GetMapping
    public String getSongsPage(@RequestParam(required = false) String error, Model model) {
        model.addAttribute("songs", songService.listSongs());
        model.addAttribute("albums", albumService.findAll());
        model.addAttribute("error", error);
        return "songs";
    }


//    @GetMapping("/add")
//    public String showAddForm(Model model) {
//        model.addAttribute("song", new Song());
//        model.addAttribute("albums", albumService.findAll());
//        return "addEdit";
//    }

    @PostMapping("/add")
    public String saveSong(@RequestParam String title, @RequestParam String genre,
                           @RequestParam String releaseYear, @RequestParam Long albumId) {
        Album album = albumService.findById(albumId);
        Song song = new Song(title, genre,  Integer.parseInt(releaseYear), new ArrayList<>());
        songService.save(song);
        song.setAlbum(album);
        return "redirect:/songs";
    }


    @GetMapping("/edit/{songId}")
    public String showEditForm(@PathVariable Long songId, Model model) {
        Song song = songService.findById(songId);
        model.addAttribute("song", song);
        return "redirect:/artists?songId=" + songId;
    }

    @GetMapping("/edit_song/{songId}")
    public String showEditSongForm(@PathVariable Long songId, Model model) {
        Song song = songService.findById(songId);
        model.addAttribute("song", song);
        model.addAttribute("albums", albumService.findAll());
        return "editSong";
    }

    @PostMapping("/edit")
    public String editSong(@RequestParam Long id, @RequestParam String title,
                           @RequestParam String genre, @RequestParam String releaseYear,
                           @RequestParam Long albumId) {
        Song song = songService.findById(id);
        if (song == null) {
            return "redirect:/songs?error=SongNotFound";
        }
        Album album = albumService.findById(albumId);
        song.setTitle(title);
        song.setGenre(genre);
        song.setReleaseYear(Integer.parseInt(releaseYear));
        song.setAlbum(album);
        songService.save(song);
        return "redirect:/songs";
    }


    @GetMapping("/delete/{id}")
    public String deleteSong(@PathVariable Long id) {
        songService.delete(id);
        return "redirect:/songs";
    }
}