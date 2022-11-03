package _esprit.karim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import _esprit.karim.entities.Contract;
public interface contractR extends JpaRepository<Contract,Integer> {
}
