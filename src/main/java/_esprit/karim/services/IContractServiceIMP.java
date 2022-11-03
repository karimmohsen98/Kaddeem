package _esprit.karim.services;

import _esprit.karim.entities.Contract;
import _esprit.karim.repository.contractR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import _esprit.karim.repository.etudiantR;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;


@Service
public class IContractServiceIMP implements contractS {

    @Autowired
    contractR con ;
    @Autowired
    etudiantR etudR ;


    @Override
    public Contract addContract(Contract c) {
        return con.save(c);
    }

    @Override
    public Contract updateContract(Contract c) {
        return con.save(c);
    }

    @Override
    public Contract retrieveCon(Integer idC) {
        return con.findById(idC).orElse(null);
    }

    @Override
    public List<Contract> getAllContracts() {
        return con.findAll();
    }

    @Override
    public void removeContract(Integer idC) {
        con.deleteById(idC);

    }

    @Override
    public Contract affectContratToEtudiant(Contract ce) {
        Contract contract = new Contract();
        if (contract.getEtudiant()!=null)
        {
            con.save(ce);
        }

        return ce;
    }
}