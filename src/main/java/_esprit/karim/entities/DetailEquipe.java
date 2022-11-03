package _esprit.karim.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idDetailEquipe ;
  private  int salle;
  private String thematique ;

  @OneToOne(mappedBy = "detailEquipe")
  Equipe equipe;

}
