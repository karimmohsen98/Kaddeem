package _esprit.karim.services;



import _esprit.karim.entities.Department;
import _esprit.karim.entities.Universite;

import java.util.List;

public interface universityS {
    public Universite addUniversite(Universite u);
    public Universite updateUniversity(Universite u);
    public Universite retrieveUni(Integer idUni);
    public List<Universite> getAllUniversities();
    public void removeUniversite(Integer idUni);

    public List<Department> retrieveDepartementsByUniversite(Integer idUniversite);
}
