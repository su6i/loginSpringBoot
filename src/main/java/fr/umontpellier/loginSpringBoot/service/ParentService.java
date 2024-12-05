package fr.umontpellier.loginSpringBoot.service;

import fr.umontpellier.loginSpringBoot.dao.ParentRepository;
import fr.umontpellier.loginSpringBoot.entity.Parent;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ParentService {
    private final ParentRepository parentRepository;
    public Parent create (Parent parent){
        return parentRepository.save(parent);
    };
}
