package mk.finki.ukim.wp.lab.web.controller;

import mk.finki.ukim.wp.lab.model.Artist;
import mk.finki.ukim.wp.lab.model.Song;
import mk.finki.ukim.wp.lab.service.ArtistService;
import mk.finki.ukim.wp.lab.service.SongService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/songDetails")
public class SongDetailsController {

    private final SongService songService;
    private final ArtistService artistService;

    public SongDetailsController(SongService songService, ArtistService artistService) {
        this.songService = songService;
        this.artistService = artistService;
    }

    @GetMapping
    public String getSongDetails(@RequestParam Long trackId, Model model) {
        Song song = songService.findById(trackId);
        if (song == null) {
            return "redirect:/songs?error=SongNotFound";
        }

        List<Artist> artists = song.getPerformers();
        model.addAttribute("song", song);
        model.addAttribute("artists", artists);

        return "songDetails";
    }

}