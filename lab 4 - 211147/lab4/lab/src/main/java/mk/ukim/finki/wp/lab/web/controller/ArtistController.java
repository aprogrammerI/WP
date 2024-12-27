package mk.ukim.finki.wp.lab.web.controller;


import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.service.ArtistService;
import mk.ukim.finki.wp.lab.service.SongService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/artists")
public class ArtistController {

    private final ArtistService artistService;
    private final SongService songService;

    public ArtistController(ArtistService artistService, SongService songService) {
        this.artistService = artistService;
        this.songService = songService;
    }

    @GetMapping
    public String getArtistsPage(@RequestParam("songId") Long songId, Model model) {
        Song song = songService.findById(songId);
        if (song == null) {
            return "redirect:/songs?error=SongNotFound";
        }
        model.addAttribute("trackId", songId);
        model.addAttribute("song", song);
        model.addAttribute("artists", artistService.listArtists());
        return "artistsList";
    }

    @PostMapping
    public String addArtistToSong(@RequestParam Long artistId, @RequestParam Long trackId) {
        Artist artist = (Artist) artistService.findById(artistId).orElse(null);
        Song song = songService.findById(trackId);
        if (artist == null || song == null) {
            return "redirect:/artists?songId=" + trackId + "&error=InvalidArtistOrSong";
        }
        songService.addArtistToSong(artist, song);
        return "redirect:/songDetails?trackId=" + trackId;
    }
}

