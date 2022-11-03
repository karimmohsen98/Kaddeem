package _esprit.karim.controllers;


import _esprit.karim.entities.Department;
import _esprit.karim.entities.Equipe;
import _esprit.karim.entities.Universite;
import _esprit.karim.repository.departmentR;
import _esprit.karim.repository.universityR;
import _esprit.karim.services.IUniversityServiceIMP;
import _esprit.karim.services.universityS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/university")
public class universityC {
    List<Universite> UNI = new ArrayList<Universite>();

    @Autowired
    universityS un ;
    @Autowired
    universityR ur;
    @Autowired
    departmentR dr;

    @PostMapping("/addUni")
    public Universite addUniversity(@RequestBody Universite u){
        return un.addUniversite(u);

    }
    @PutMapping("/editUni")
    public Universite updateUni(@RequestBody Universite u){
        return un.updateUniversity(u);

    }
    @GetMapping("/retrieveUni/{idUni}")
    public Universite getuniById(@PathVariable Integer idUni){
        return un.retrieveUni(idUni);

    }
    @GetMapping("/listUni")
    public List<Universite> listeUnis(){
        return un.getAllUniversities();

    }
    @DeleteMapping("/deleteE/{idUni}")
    public void deleteUni(@PathVariable Integer idUni){
        un.removeUniversite(idUni);
    }


    @PostMapping("/assignU/{idUniversite}/{idDepartement}")
    public void assignUniversiteToDepartement(@PathVariable Integer idUniversite,@PathVariable Integer idDepartement)
    {
        Department department= dr.findById(idDepartement).orElse(null);
        Universite  universite = ur.findById(idUniversite).orElse(null);

        if (department!=null  &&  universite!=null)
        {

            universite.getDepa().add(department);
            ur.save(universite);


        }


    }
    @GetMapping("{idUniversite}")
    public List<Department> retrieveDepartementsByUniversite(@PathVariable Integer idUniversite )
    {
     return un.retrieveDepartementsByUniversite(idUniversite);


    }



}
