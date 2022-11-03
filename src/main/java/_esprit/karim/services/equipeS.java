package _esprit.karim.services;

import _esprit.karim.entities.Equipe;
import _esprit.karim.entities.Etudiant;

import java.util.List;

public interface equipeS {
    public Equipe addEquipe(Equipe e);
    public Equipe updateEquipe(Equipe e);
    public Equipe retrieveEq(Integer idEq);
    public List<Equipe> getAllEquipes();
    public void removeEquipe(Integer idEq);
}
