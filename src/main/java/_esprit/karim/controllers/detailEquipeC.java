package _esprit.karim.controllers;



import _esprit.karim.entities.DetailEquipe;
import _esprit.karim.services.detailEquipeS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/detaileq")
@RestController
public class detailEquipeC {

    List<DetailEquipe> de = new ArrayList<DetailEquipe>();

    @Autowired
    detailEquipeS des ;

    @PostMapping("/adddetaileq")
    public DetailEquipe addDetailEq(@RequestBody DetailEquipe de){
        return des.addDetailEq(de);

    }
    @PutMapping("/editdetaileq")
    public DetailEquipe updateDetailEq(@RequestBody DetailEquipe de){
        return des.updateDetailEq(de);

    }
    @GetMapping("/retrieveEqDe/{idDetailEq}")
    public DetailEquipe getEqDetailById(@PathVariable Integer idDetailEq){
        return des.getDetailEqById(idDetailEq);

    }
    @GetMapping("/listeDeEq")
    public List<DetailEquipe> listeDetailEq(){
        return des.getAllEquipeDetails();

    }
    @DeleteMapping("/deleteE/{idDeEq}")
    public void deleteContract(@PathVariable Integer idDeEq){
        des.removeDetailEquipe(idDeEq);
    }

}
