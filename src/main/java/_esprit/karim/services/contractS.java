package _esprit.karim.services;

import _esprit.karim.entities.Contract;
import _esprit.karim.entities.Etudiant;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface contractS {
    public Contract addContract(Contract c);
    public Contract updateContract(Contract c);
    public Contract retrieveCon(Integer idC);
    public List<Contract> getAllContracts();
    public void removeContract(Integer idC);

    public Contract affectContratToEtudiant (Contract ce);

}
