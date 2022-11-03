package _esprit.karim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import _esprit.karim.entities.Department;

import java.util.List;

public interface departmentR extends JpaRepository<Department,Integer> {

}
