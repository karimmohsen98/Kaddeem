package _esprit.karim.services;

import _esprit.karim.entities.Department;
import _esprit.karim.entities.Etudiant;

import java.util.List;

public interface departmentS {
    public Department addDep(Department dep);
    public Department updateDep(Department dep);
    public Department retrieveDep(Integer idDep);
    public List<Department> retrieveAllDeps();

    public List<Department> retrieveDepartementsByUniversite(Integer idUniversite);
}
