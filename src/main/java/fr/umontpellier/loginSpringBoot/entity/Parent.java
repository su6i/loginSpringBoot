package fr.umontpellier.loginSpringBoot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Parent extends User{
    private String jobPosition;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "child")
    private Child child;
}
