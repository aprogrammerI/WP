//package mk.finki.ukim.wp.lab.web.servlet;
//
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import mk.finki.ukim.wp.lab.model.Song;
//import mk.finki.ukim.wp.lab.service.SongService;
//import org.thymeleaf.context.WebContext;
//import org.thymeleaf.spring6.SpringTemplateEngine;
//import org.thymeleaf.web.IWebExchange;
//import org.thymeleaf.web.servlet.JakartaServletWebApplication;
//
//import java.io.IOException;
//
//@WebServlet(urlPatterns = "/songsDetails")
//public class SongDetailsServlet extends HttpServlet
//{
//    private  final SongService songService;
//    private final SpringTemplateEngine springTemplateEngine;
//
//    public SongDetailsServlet(SongService songService, SpringTemplateEngine springTemplateEngine)
//    {
//        this.songService = songService;
//        this.springTemplateEngine = springTemplateEngine;
//    }
//
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
//    {
//
//        String selectedSongId = req.getParameter("selectedSongId");
////        if (selectedSongId ==  null)
////        {
////            resp.sendRedirect("/listSongs");
////            return;
////        }
//
//        Song selectedSong = songService.findById(selectedSongId);
//
////        req.setAttribute("selectedSong",selectedSong);
//
//        IWebExchange webExchange = JakartaServletWebApplication
//                .buildApplication(getServletContext())
//                .buildExchange(req,resp);
//
//        WebContext webContext = new WebContext(webExchange);
//
////        super.doGet(req, resp);
//
//        webContext.setVariable("selectedSong",selectedSong);
//
//        springTemplateEngine.process("songDetails.html",webContext,resp.getWriter());
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
//    {
////        super.doPost(req, resp);
//
//
//        resp.sendRedirect("/listSongs");
//    }
//}
