//package mk.finki.ukim.wp.lab.web.filter;
//
//import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebFilter;
//import jakarta.servlet.annotation.WebInitParam;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//
//import java.io.IOException;
//
//@WebFilter(filterName = "auth-filter", urlPatterns = "/*",
//        dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD},
//        initParams = {
//                @WebInitParam(name = "list-path", value = "/listSongs"),
//                @WebInitParam(name = "artist-path", value = "/artists"),
//                @WebInitParam(name = "details-path", value = "/songsDetails")
//
//
//
//        })
//public class CheckFilter implements Filter
//{
//    private String listPath;
//    private String artistPath;
//    private String detailsPath;
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        Filter.super.init(filterConfig);
//        listPath = filterConfig.getInitParameter("list-path");
//        artistPath = filterConfig.getInitParameter("artist-path");
//        detailsPath = filterConfig.getInitParameter("details-path");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest req = (HttpServletRequest) servletRequest;
//        HttpServletResponse resp = (HttpServletResponse) servletResponse;
//
//
//
//        String path = req.getServletPath();
//        String selectedSongId = req.getParameter("selectedSongId");
//
//        if(selectedSongId == null)
//        {
//            resp.sendRedirect("/listSongs");
//        }
//
//        if ((path.startsWith(listPath) ||  path.startsWith(artistPath) || path.startsWith(detailsPath))&& !path.contains("null")) {
//            // Allow access if the path is login or register or if the user is logged in
//            filterChain.doFilter(servletRequest, servletResponse);
//        } else {
//            // Redirect to login page if user is not logged in and trying to access restricted pages
//            resp.sendRedirect("/listSongs");
//        }
//    }
//
//    @Override
//    public void destroy() {
//        Filter.super.destroy();
//    }
//}
