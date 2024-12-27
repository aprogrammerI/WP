//package mk.finki.ukim.wp.lab.service.impl;
//
//import mk.finki.ukim.wp.lab.exceptions.InvalidArgumentsException;
//import mk.finki.ukim.wp.lab.model.User;
//import mk.finki.ukim.wp.lab.repository.jpa.UserRepository;
//import mk.finki.ukim.wp.lab.service.AuthService;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AuthServiceImpl implements AuthService {
//
//    private final UserRepository userRepository;
//
//    public AuthServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public User login(String username, String password) {
//        // Check if the username and password are not null or empty
//        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
//            throw new InvalidArgumentsException();
//        }
//        return userRepository.findByUsernameAndPassword(username, password)
//                .orElseThrow();
//    }
//}
//
