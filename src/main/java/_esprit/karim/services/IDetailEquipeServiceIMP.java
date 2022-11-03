package _esprit.karim.services;

import _esprit.karim.entities.DetailEquipe;
import _esprit.karim.repository.detailEquipeR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDetailEquipeServiceIMP implements detailEquipeS {

    @Autowired
    detailEquipeR der;


    @Override
    public DetailEquipe addDetailEq(DetailEquipe de) {
        return der.save(de) ;
    }

    @Override
    public DetailEquipe updateDetailEq(DetailEquipe de) {
        return der.save(de);
    }

    @Override
    public DetailEquipe getDetailEqById(Integer idDetailEq) {
        return der.findById(idDetailEq).orElse(null);
    }

    @Override
    public List<DetailEquipe> getAllEquipeDetails() {
        return der.findAll();
    }

    @Override
    public void removeDetailEquipe(Integer idDetailEquipe) {
        der.deleteById(idDetailEquipe);

    }
}
