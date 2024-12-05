package fr.umontpellier.loginSpringBoot.entity;

import fr.umontpellier.loginSpringBoot.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
//@MappedSuperclass
@Entity
public class User extends BaseEntity {
    @Column(name = "prenom")
    private String name;
    private String familyName;

    @Column(unique = true)
    private long nationalCode;
    @Enumerated(EnumType.STRING)
    private Gender gender;

}
