package mk.finki.ukim.wp.lab.web.controller;

import mk.finki.ukim.wp.lab.model.Artist;
import mk.finki.ukim.wp.lab.model.Song;
import mk.finki.ukim.wp.lab.service.ArtistService;
import mk.finki.ukim.wp.lab.service.SongService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        Artist artist = artistService.ArtistFindById(artistId).orElse(null);
        Song song = songService.findById(trackId);
        if (artist == null || song == null) {
            return "redirect:/artists?songId=" + trackId + "&error=InvalidArtistOrSong";
        }
        songService.addArtistToSong(artist, song);
        return "redirect:/songDetails?trackId=" + trackId;
    }
}
