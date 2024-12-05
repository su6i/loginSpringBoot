package fr.umontpellier.loginSpringBoot.controller;

import fr.umontpellier.loginSpringBoot.entity.User;
import fr.umontpellier.loginSpringBoot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@AllArgsConstructor
@RequiredArgsConstructor
@RequestMapping("user/")
public class UserController {
    public final UserService userService;

    @PostMapping("save/")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.create(user), HttpStatus.CREATED);
    }
//    public User create (User user){
//        return userService.create(user);
//    }
}
