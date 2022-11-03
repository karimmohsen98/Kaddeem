package _esprit.karim.services;

import _esprit.karim.entities.Equipe;
import _esprit.karim.repository.equipeR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IEquipeServiceIMP implements equipeS {
    @Autowired
    equipeR team;

    @Override
    public Equipe addEquipe(Equipe e) {
        return team.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return team.save(e);
    }

    @Override
    public Equipe retrieveEq(Integer idEq) {
        return team.findById(idEq).orElse(null);
    }

    @Override
    public List<Equipe> getAllEquipes() {
        return team.findAll();
    }

    @Override
    public void removeEquipe(Integer idEq) {
        team.deleteById(idEq);

    }
}
