package fr.umontpellier.loginSpringBoot.service;

import fr.umontpellier.loginSpringBoot.dao.ChildRepository;
import fr.umontpellier.loginSpringBoot.entity.Child;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChildService {
    private final ChildRepository childRepository;
    public Child create(Child child) {
        return childRepository.save(child);
    }
    public Child findById(Long id) {
        return childRepository.findById(id).orElse(null);
    }
    public Child update(Child child) {
//        child = findById(child.getId());
        findById(child.getId());
        return childRepository.save(child);
    }
    public List<Child> findAll() {
        return childRepository.findAll();
    }
    public Child deleteById(Long id) {
        return childRepository.deleteById(id);
    }
    public void deleteOne(Long id) {
        childRepository.deleteById(id);
    }
}
