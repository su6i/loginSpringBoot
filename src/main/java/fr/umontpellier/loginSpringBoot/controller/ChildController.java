package fr.umontpellier.loginSpringBoot.controller;

import fr.umontpellier.loginSpringBoot.entity.Child;
import fr.umontpellier.loginSpringBoot.service.ChildService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@AllArgsConstructor
@RequiredArgsConstructor
@RequestMapping("child/")
public class ChildController {
    private final ChildService childService;

    @PostMapping("save/")
    public ResponseEntity<Child> createChild (@RequestBody Child child) {
        return new ResponseEntity<>(childService.create(child), HttpStatus.CREATED);
    }
    @GetMapping("find/{id}")
    public ResponseEntity<Child> findChildById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(childService.findById(id), HttpStatus.OK);
    }

}
