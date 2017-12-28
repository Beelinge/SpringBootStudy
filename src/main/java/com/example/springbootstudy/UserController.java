package com.example.springbootstudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

//    @GetMapping("/getusers")
//    private List<User> getUsers() {
//        return userRepository.findAll();
//    }
//
//    @GetMapping("/adduser")
//    private User addUser() {
//        User u = new User();
//        u.setName("Beelin");
//        u.setAge(27);
//       return   userRepository.save(u);
//    }
}
