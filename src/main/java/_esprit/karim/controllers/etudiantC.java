package _esprit.karim.controllers;

import _esprit.karim.entities.*;
import _esprit.karim.repository.contractR;
import _esprit.karim.repository.departmentR;
import _esprit.karim.repository.equipeR;
import _esprit.karim.repository.etudiantR;
import _esprit.karim.services.IEtudientServiceIMP;
import _esprit.karim.services.etudiantS;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/student")
public class etudiantC {
    List<Etudiant> l = new ArrayList<Etudiant>();

    @Autowired//inject a bean that implement the etudiant service
    etudiantS ietudiantSer ;
    @Autowired
    etudiantR er;
    @Autowired
    departmentR dr;

    @Autowired
    contractR cr ;

    @Autowired
    equipeR eqR;

    @GetMapping("/hello/{classname}")
    public String sayHEllo(@PathVariable String classname){

        return "hello" +classname;
    }

    @PostMapping("/addE")
    public Etudiant addEtudiant(@RequestBody Etudiant e){
       return ietudiantSer.addStudent(e);

    }
    //depart id pathvariable
    //recuperation des objet
    //affecte heja fi heja  //traitement
    //save
    @PutMapping("/editE")
    public Etudiant updateEtudiant(@RequestBody Etudiant e){
        return ietudiantSer.updateStudent(e);

    }
    @GetMapping("/getById/{idE}")
    public Etudiant getEtudiantById(@PathVariable Integer idE){
           return ietudiantSer.getById(idE);

    }

    @GetMapping("/listE")
    public List<Etudiant> listeEtudiant(){
        return ietudiantSer.getAllStudent();

    }
    @DeleteMapping("/deleteE/{idEtudiant}")
    public void deleteEtudiant(@PathVariable Integer idEtudiant){
        ietudiantSer.removeEtudiant(idEtudiant);
    }

    @PostMapping("/AssignE/{etudiantId}/{depId}")
    public void AssignE(@PathVariable Integer etudiantId,@PathVariable Integer depId){

        Etudiant etudiant = er.findById(etudiantId).orElse(null);
        Department department =dr.findById(depId).orElse(null);

        if (etudiant !=null && department !=null)
        {
            etudiant.setDep(department);
            er.save(etudiant);
        }
    }
    @PostMapping("/addassign/{idContrat}/{idEquipe}")
    public Etudiant addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e, @PathVariable Integer idContrat,@PathVariable Integer idEquipe)
    {
        Contract contract = cr.findById(idContrat).orElse(null);
        Equipe equipe = eqR.findById(idEquipe).orElse(null);
        if (contract !=null && equipe !=null)
        {

            contract.setEtudiant(e);
            equipe.getLetudiant().add(e);

        }
return ietudiantSer.addStudent(e);



    }
    @GetMapping("/retrieve/{idDep}")
    public List<Etudiant> findEtudiantByDep(@PathVariable Integer idDep)
    {
          return ietudiantSer.getEtudiantByDep(idDep);
          //return ietudiantSer.getEtudiantByDep2(idDep);



    }



}
