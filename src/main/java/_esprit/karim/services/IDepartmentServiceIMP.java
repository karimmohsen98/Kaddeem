package _esprit.karim.services;

import _esprit.karim.entities.Department;
import _esprit.karim.entities.Etudiant;
import _esprit.karim.entities.Universite;
import _esprit.karim.repository.universityR;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import _esprit.karim.repository.departmentR;

import java.util.List;
@AllArgsConstructor
@Service
public class IDepartmentServiceIMP implements departmentS{


    private final departmentR  department;
    private final  universityR uni;

    @Override
    public Department addDep(Department d){
        return department.save(d);
    }
    @Override
    public Department updateDep(Department d) {
        return department.save(d);
    }

    @Override
    public Department retrieveDep(Integer idDep) {
        return department.findById(idDep).orElse(null);
    }

    @Override
    public List<Department> retrieveAllDeps() {
        return department.findAll() ;
    }

    @Override
    public List<Department> retrieveDepartementsByUniversite(Integer idUniversite) {
        Universite universite = uni.findById(idUniversite).orElse(null);

        if (universite != null) {
            return universite.getDepa();
        }
        return null;
    }


}
