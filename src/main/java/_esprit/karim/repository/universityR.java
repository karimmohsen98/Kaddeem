package _esprit.karim.repository;

import _esprit.karim.entities.Department;
import _esprit.karim.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface universityR extends JpaRepository <Universite, Integer> {
    public List<Universite> findUniversiteByDepa(Integer idUniv);
}