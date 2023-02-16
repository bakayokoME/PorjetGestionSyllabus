package isis.projet.backend.entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.management.relation.Role;

import jakarta.persistence.*;

import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/

import jakarta.validation.constraints.Size;

@Entity
@Getter @Setter
@NoArgsConstructor @RequiredArgsConstructor @ToString

public class Utilisateur {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Basic(optional = false)
    @NonNull
    @Size(min = 1, max = 10)
    @Column(nullable = false, length = 40)
    private String nom;

    @Basic(optional = false)
    @NonNull
    @Size(min = 1, max = 10)
    @Column(nullable = false, length = 40)
    private String prenom;

    @Basic(optional = false)
    @NonNull
    @Size(min = 1, max = 40)
    @Column(nullable = false, length = 40)
    private String username;

    @Basic(optional = false)
    @NonNull
    @Size(min = 1, max = 10)
    @Column(nullable = false, length = 40)
    private String password;

    @Basic(optional = false)
    @NonNull
    @Size(min = 1, max = 40)
    @Column(nullable = false, length = 40)
    private String role;

    @OneToMany(mappedBy = "utilisateur")
    private List<Annee> annee = new LinkedList<>();

    @OneToMany(mappedBy = "utilisateur")
    private List<Matiere> matiere = new LinkedList<>();
}
