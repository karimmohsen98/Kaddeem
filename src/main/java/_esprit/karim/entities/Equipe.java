package _esprit.karim.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipe;
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private _esprit.karim.entities.Niveau Niveau;
    @ManyToMany
    private List<Etudiant> letudiant;
    @OneToOne
    DetailEquipe detailEquipe;
}
