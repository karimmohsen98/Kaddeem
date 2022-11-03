package _esprit.karim.controllers;


import _esprit.karim.entities.Equipe;
import _esprit.karim.entities.Option;
import _esprit.karim.services.equipeS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/equipe")
public class equipeC {

    List<Equipe> E = new ArrayList<Equipe>();

    @Autowired
    equipeS teams;


    @PostMapping("/addEq")
    public Equipe addEquipe(@RequestBody Equipe e){
        return teams.addEquipe(e);

    }
    @PutMapping("/editEq")
    public Equipe updateEquipe(@RequestBody Equipe e){
        return teams.updateEquipe(e);

    }
    @GetMapping("/retrieveEq/{idEq}")
    public Equipe getEqById(@PathVariable Integer idEq){
        return teams.retrieveEq(idEq);

    }
    @GetMapping("/listeEq")
    public List<Equipe> listeEquipe(){
        return teams.getAllEquipes();

    }
    @DeleteMapping("/deleteE/{idEq}")
    public void deleteEquipe(@PathVariable Integer idEq){
        teams.removeEquipe(idEq);
    }


}
