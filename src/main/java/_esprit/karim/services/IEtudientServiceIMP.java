package _esprit.karim.services;

import _esprit.karim.entities.Department;
import _esprit.karim.entities.Etudiant;
import _esprit.karim.entities.Option;
import _esprit.karim.repository.departmentR;
import _esprit.karim.repository.etudiantR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;


@Service //cree une instance(bean) de cette classe
public class IEtudientServiceIMP implements etudiantS {

    @Autowired
    etudiantR eR;
    @Autowired
    IDepartmentServiceIMP iDepartmentServiceIMP;

    @Autowired

    departmentR r;


    @Override
    public Etudiant addStudent(Etudiant e) {
        return eR.save(e);
    }
  /*  @Override
    public void AssignEtudiant(Integer etudiantId ,Integer depId)
    { return etudiant.save();
    }**/

    @Override
    public Etudiant updateStudent(Etudiant e) {
        return eR.save(e);
    }

    @Override
    public Etudiant getById(Integer idEtudiant) {
        return eR.findById(idEtudiant).orElse(null);
    }

    @Override
    public List<Etudiant> getAllStudent() {
        return eR.findAll();
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        eR.deleteById(idEtudiant);

    }

    @Override
    public List<Etudiant> getEtudiantByDep(Integer idDep) {
        //Recherche
        Department department = r.findById(idDep).orElse(null);

        if (department != null) {
          return  department.getLee();
        }
        return null;
    }

    @Override
    public List<Etudiant> getEtudiantByDep2(Integer idDep) {
        return eR.findByDepartment(iDepartmentServiceIMP.retrieveDep(idDep));
    }

}
