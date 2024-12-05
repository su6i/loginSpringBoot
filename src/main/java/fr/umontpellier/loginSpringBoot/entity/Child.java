package fr.umontpellier.loginSpringBoot.entity;

import fr.umontpellier.loginSpringBoot.enums.AcademicLevel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Child extends User{

    @Column(unique = true)
    private String studentNumber;

    @Enumerated(EnumType.STRING)
    private AcademicLevel academicLevel;

    @OneToMany(mappedBy = "child")
    private Set<Parent> parents= new HashSet<>();


}
