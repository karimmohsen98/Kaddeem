package _esprit.karim.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this line is to set the id
    private int idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private _esprit.karim.entities.Option Option;

    @OneToMany(mappedBy = "etudiant")
    private List<Contract> contract;

    @ManyToMany(mappedBy = "letudiant")
    private List<Equipe> le ;


    @ManyToOne
    private Department dep;



}
