package _esprit.karim.services;

import _esprit.karim.entities.DetailEquipe;

import java.util.List;

public interface detailEquipeS {

    public DetailEquipe addDetailEq(DetailEquipe de);
    public DetailEquipe updateDetailEq(DetailEquipe de);
    public DetailEquipe getDetailEqById(Integer idDetailEq);
    public List<DetailEquipe> getAllEquipeDetails();
    public void removeDetailEquipe(Integer idDetailEquipe);
}
