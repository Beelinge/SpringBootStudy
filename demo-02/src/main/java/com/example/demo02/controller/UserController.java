package com.example.demo02.controller;

import com.example.demo02.model.Student;
import com.example.demo02.model.User;
import com.example.demo02.repository.StudentRepository;
import com.example.demo02.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getusers")
    private List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/adduser")
    private User addUser(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        User u = new User();
        u.setName(name);
        u.setAge(age);
       return   userRepository.save(u);
    }

    @PostMapping(value = "/personDelete")
    public void personDelete(@RequestParam("id") Integer id){
        userRepository.delete(id);
    }
    @PostMapping(value = "/personUpdate")
    public User personUpdate(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("age") Integer age) {
        User p = new User();
        p.setName(name);
        p.setAge(age);
        p.setId(id);
        return   userRepository.save(p);
    }

    @Autowired
    private   StudentRepository studentRepository;
    @GetMapping("/getstudent")
    private List<Student> getStudent() {
        return studentRepository.findAll();
    }
}
