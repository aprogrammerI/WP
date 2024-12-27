package mk.ukim.finki.wp.lab.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.service.ArtistService;
import mk.ukim.finki.wp.lab.service.SongService;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.web.IWebExchange;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@WebServlet (name = "ArtistServlet", urlPatterns = "/artist")
public class АrtistServlet extends HttpServlet {

    private  final ArtistService artistService;
    private final SpringTemplateEngine springTemplateEngine;
    private final SongService songService;

    public АrtistServlet(ArtistService artistService, SpringTemplateEngine springTemplateEngine, SongService songService) {
        this.artistService = artistService;
        this.springTemplateEngine = springTemplateEngine;
        this.songService = songService;
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String selectedSongId = req.getParameter("selectedSongId");


        IWebExchange webExchange = JakartaServletWebApplication
                .buildApplication(getServletContext())
                .buildExchange(req,resp);

        WebContext webContext = new WebContext(webExchange);

        webContext.setVariable("artists",artistService.listArtists());


        req.setAttribute("selectedSongId",selectedSongId);

        springTemplateEngine.process("artistsList.html",webContext,resp.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Long selectedSongId = Long.valueOf(req.getParameter("selectedSongId"));
        String selectedArtistId = req.getParameter("artistId");

        String check = selectedArtistId;

        if(check==null){
            resp.sendRedirect("/songsDetails?selectedSongId="+selectedSongId);
            return;
        }

        Optional<Artist> artist = artistService.findById(Long.parseLong(selectedArtistId));
        Song selectedSong = songService.findById(selectedSongId);
        artist.get().setSongs(selectedSong.getTitle());

        List<String> songs = artist.get().getSongs();

        if (selectedSongId != null) {
            Song song = songService.findById(selectedSongId);
            Artist artist1 = artist.get();

            songService.addArtistToSong(artist1, song);
        }

        resp.sendRedirect("/songsDetails?selectedSongId="+selectedSongId);
    }
}
