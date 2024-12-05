package fr.umontpellier.loginSpringBoot.service;

import fr.umontpellier.loginSpringBoot.dao.UserRepository;
import fr.umontpellier.loginSpringBoot.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public User create(User user){
        return userRepository.save(user);
    }
}
