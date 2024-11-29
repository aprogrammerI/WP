//package mk.finki.ukim.wp.lab.web.servlet;
//
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import mk.finki.ukim.wp.lab.model.Artist;
//import mk.finki.ukim.wp.lab.model.Song;
//import mk.finki.ukim.wp.lab.service.ArtistService;
//import mk.finki.ukim.wp.lab.service.SongService;
//import org.thymeleaf.context.WebContext;
//import org.thymeleaf.spring6.SpringTemplateEngine;
//import org.thymeleaf.web.IWebExchange;
//import org.thymeleaf.web.servlet.JakartaServletWebApplication;
//
//import java.io.IOException;
//import java.util.Optional;
//
//@WebServlet(urlPatterns = "/artists")
//public class ArtistServlet extends HttpServlet
//{
//    private  final ArtistService artistService;
//    private final SongService songService;
//    private final SpringTemplateEngine springTemplateEngine;
//
//    public ArtistServlet(ArtistService songService, SongService songService1, SpringTemplateEngine springTemplateEngine) {
//        this.artistService = songService;
//        this.songService = songService1;
//        this.springTemplateEngine = springTemplateEngine;
//    }
//
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
//    {
//
//        String selectedSongId = req.getParameter("selectedSongId");
//
//        IWebExchange webExchange = JakartaServletWebApplication
//                .buildApplication(getServletContext())
//                .buildExchange(req,resp);
//
//        WebContext webContext = new WebContext(webExchange);
//
//        webContext.setVariable("artists",artistService.listArtists());
//
//        req.setAttribute("selectedSongId",selectedSongId);
//
////        super.doGet(req, resp);
//
//        springTemplateEngine.process("artistsList.html",webContext,resp.getWriter());
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
//    {
////        super.doPost(req, resp);
//
//        String selectedSongId = req.getParameter("selectedSongId");
//        String selectedArtistId = req.getParameter("artistId");
//
//        String check = selectedArtistId;
//
//
//
////        if (check==null)
////        {
////            resp.sendRedirect("/songsDetails?selectedSongId=" + selectedSongId);
////            return;
////        }
//
//        Optional<Artist> artist1 = artistService.ArtistfindById(Long.parseLong(selectedArtistId));
//
//        if (selectedSongId != null)
//        {
//
//            Song song =  songService.findByTrackId(selectedSongId);
//            Artist artist = artist1.get();
//
//           songService.addArtistToSong(artist,song);
//        }
//
//        resp.sendRedirect("/songsDetails?selectedSongId=" + selectedSongId);
//    }
//}
