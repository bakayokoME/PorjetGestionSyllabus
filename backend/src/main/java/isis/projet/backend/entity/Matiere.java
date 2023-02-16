package isis.projet.backend.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity@Getter@Setter
@NoArgsConstructor  @ToString
public class Matiere {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Basic(optional = false)
    @NonNull
    @Column(nullable = false, length = 300)
    private String intitule;

    @Basic(optional = false)
    @Size(min = 1, max = 10)
    @NonNull
    @Column(nullable = false, length = 40)
    private String codematiere;

    @Basic(optional = false)
    @Size(min = 1, max = 10)
    @Column(nullable = false, length = 40)
    private int heurecm;


    @Basic(optional = false)
    @NonNull
    @Size(min = 1, max = 10)
    @Column(nullable = false, length = 40)
    private int heuretd;



    @Basic(optional = false)
    @NonNull
    @Column(nullable = false)
    private String descripenseignement;

    @Basic(optional = false)
    @NonNull
    @Column(nullable = false)
    private String objetcifpedagogique;

    @ManyToOne
    private  Ue ue;

    @ManyToOne
    private Utilisateur utilisateur;

}
