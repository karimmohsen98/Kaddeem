package _esprit.karim.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contract implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContract;
    // we always import date from .util and not .sql for obvious reasons
    @Temporal(TemporalType.DATE)
    private Date dateDebutContract;
    @Temporal(TemporalType.DATE)
    private Date dateFinContract;
    @Enumerated(EnumType.STRING)
    private _esprit.karim.entities.Specialite Specialite;
    private boolean archive;
    //@Transient password and confirm password case , so to only get the password and not double KEKL
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Etudiant etudiant ;
}

