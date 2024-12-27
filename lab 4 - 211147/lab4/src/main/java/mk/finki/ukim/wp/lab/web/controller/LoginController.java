//package mk.finki.ukim.wp.lab.web.controller;
//
//import ch.qos.logback.core.model.Model;
//import jakarta.servlet.http.HttpServletRequest;
//import mk.finki.ukim.wp.lab.model.User;
//import mk.finki.ukim.wp.lab.service.AuthService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
////@RestController
//@Controller
//@RequestMapping("/login")
//public class LoginController {
//    private final AuthService authService;
//    public LoginController(AuthService authService) {
//        this.authService = authService;
//    }
//
//    //@RequestMapping(method = RequestMethod.GET, value = "/login")
//    @GetMapping
//    public String getLoginPage() {
//        // Return the name of the Thymeleaf template that will be used to render the login page
//        return "login";
//    }
//
//    @PostMapping
//    public String login(HttpServletRequest request, Model model) {
//        User user = null;
//
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        try {
//            user = authService.login(username, password);
//            request.getSession().setAttribute("user", user);
//            // Redirect to the home page
//            return "redirect:/home";
//        } catch (RuntimeException ex) {
//
////            model.addAttribute("hasError", true);
////            model.addAttribute("error", ex.getMessage());
//            return "login";
//        }
//    }
//}
//
