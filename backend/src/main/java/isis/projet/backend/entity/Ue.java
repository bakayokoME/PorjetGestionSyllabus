package isis.projet.backend.entity;

import java.util.LinkedList;
import java.util.List;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@NoArgsConstructor  @ToString
public class Ue {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Basic(optional = false)
    @NonNull
    @Column(nullable = false)
    private String intitule;

    @Basic(optional = false)
    @NonNull
    @Size(min = 1, max = 200)
    @Column(nullable = false, length = 40)
    private String codeue;

    @Basic(optional = false)
    @NonNull
    @Size(min = 1, max = 10)
    @Column(nullable = false, length = 40)
    private int creditects;

    @Basic(optional = false)
    @NonNull
    @Column(nullable = false)
    private String prerequis;

    @Basic(optional = false)
    @NonNull
    @Size(min = 1, max = 2)
    @Column(nullable = false, length = 40)
    private int numsemestre;

    @OneToMany(mappedBy = "ue")
    private List<Matiere> matiere = new LinkedList<>();
    @ManyToOne
    private Annee annee = new Annee();

}
