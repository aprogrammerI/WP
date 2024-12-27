//package mk.finki.ukim.wp.lab.web.controller.filter;
//
//import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebFilter;
//import jakarta.servlet.annotation.WebInitParam;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.context.annotation.Profile;
//
//import java.io.IOException;
//
//@WebFilter(filterName = "auth-filter", urlPatterns = "/*",
//        dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD},
//        initParams = {
//                @WebInitParam(name = "ignore-path", value = "/login"),
//                @WebInitParam(name = "register-path", value = "/register")
//        })
//@Profile("servlet")
//public class LoginFilter implements Filter {
//    private String ignorePath;
//    private String registerPath;
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        Filter.super.init(filterConfig);
//        ignorePath = filterConfig.getInitParameter("ignore-path");
//        registerPath = filterConfig.getInitParameter("register-path");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest req = (HttpServletRequest) servletRequest;
//        HttpServletResponse resp = (HttpServletResponse) servletResponse;
//
//        User user = (User) req.getSession().getAttribute("user");
//
//        String path = req.getServletPath();
//
//        if (path.startsWith(ignorePath) || path.startsWith(registerPath) || user != null) {
//            // Allow access if the path is login or register or if the user is logged in
//            filterChain.doFilter(servletRequest, servletResponse);
//        } else {
//            // Redirect to login page if user is not logged in and trying to access restricted pages
//            resp.sendRedirect("/login");
//        }
//    }
//
//    @Override
//    public void destroy() {
//        Filter.super.destroy();
//    }
//}
//
