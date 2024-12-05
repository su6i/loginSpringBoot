package fr.umontpellier.loginSpringBoot.dao;

import fr.umontpellier.loginSpringBoot.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepository extends JpaRepository<Child, Long> {

    void deleteById(Long id);
}
