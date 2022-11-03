package _esprit.karim.services;

import _esprit.karim.entities.Department;
import _esprit.karim.entities.Universite;
import _esprit.karim.repository.departmentR;
import _esprit.karim.repository.universityR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUniversityServiceIMP implements universityS{
    @Autowired
    universityR uni ;
    @Autowired
    departmentR dep;

    @Override
    public Universite addUniversite(Universite u) {
        return uni.save(u);
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return uni.save(u);
    }

    @Override
    public Universite retrieveUni(Integer idUni) {
        return uni.findById(idUni).orElse(null);
    }

    @Override
    public List<Universite> getAllUniversities() {
        return uni.findAll();
    }

    @Override
    public void removeUniversite(Integer idUni) {
        uni.deleteById(idUni);

    }

    @Override
    public List<Department> retrieveDepartementsByUniversite(Integer idUniversite) {
        Universite universite = uni.findById(idUniversite).orElse(null);

        if (universite !=null){

            return universite.getDepa();
        }
        return null;
    }
}
