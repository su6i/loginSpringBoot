package fr.umontpellier.loginSpringBoot.dao;

import fr.umontpellier.loginSpringBoot.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {
}
