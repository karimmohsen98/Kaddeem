package _esprit.karim.controllers;

import _esprit.karim.entities.Contract;
import _esprit.karim.entities.Equipe;
import _esprit.karim.entities.Etudiant;
import _esprit.karim.repository.contractR;
import _esprit.karim.repository.etudiantR;
import _esprit.karim.services.IContractServiceIMP;
import _esprit.karim.services.contractS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/contract")
public class contractC {

    List<Contract> Con = new ArrayList<Contract>();

    @Autowired
    contractS cons ;

    @Autowired
    contractR cr;

    @Autowired
    etudiantR er ;

    @PostMapping()
    public Contract addContract(@RequestBody Contract c){
        return cons.addContract(c);

    }
    @PutMapping()
    public Contract updateContract(@RequestBody Contract c){
        return cons.updateContract(c);

    }
    @GetMapping("{idCon}")
    public Contract getConById(@PathVariable Integer idCon){
        return cons.retrieveCon(idCon);

    }
    @GetMapping()
    public List<Contract> listecontract(){
        return cons.getAllContracts();

    }
    @DeleteMapping("{idCon}")
    public void deleteContract(@PathVariable Integer idCon){
        cons.removeContract(idCon);
    }

    @PostMapping("{nomE}/{prenomE}")
    public void affectContratToEtudiant (@RequestBody Contract ce)
    {

        cons.affectContratToEtudiant(ce);
    }

}
