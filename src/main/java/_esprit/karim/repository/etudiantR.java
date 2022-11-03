package _esprit.karim.repository;

import _esprit.karim.entities.Department;
import _esprit.karim.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface etudiantR extends JpaRepository<Etudiant,Integer> {
   public List<Etudiant> findByDepartment(Department d);
}
