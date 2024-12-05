package fr.umontpellier.loginSpringBoot.controller;

import fr.umontpellier.loginSpringBoot.entity.Parent;
import fr.umontpellier.loginSpringBoot.service.ParentService;
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
@RequestMapping("parent/")
public class ParentController {
    private final ParentService parentService;

    @PostMapping("save/")
    public ResponseEntity<Parent> createParent(@RequestBody Parent parent){
        return new ResponseEntity<>(parentService.create(parent), HttpStatus.CREATED);


    };
}
