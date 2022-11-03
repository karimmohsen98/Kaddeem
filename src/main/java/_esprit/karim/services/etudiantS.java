package _esprit.karim.services;


import _esprit.karim.entities.Etudiant;
import _esprit.karim.entities.Option;


import java.util.List;

public interface etudiantS {
    public Etudiant addStudent(Etudiant e);
    public Etudiant updateStudent(Etudiant e);
    public Etudiant getById(Integer idEtudiant);
    public List<Etudiant> getAllStudent();
    public void removeEtudiant(Integer idEtudiant);
  /*  public Etudiant AssignEtudiant (Integer etudiantId,Integer depId);*/
    public List<Etudiant> getEtudiantByDep(Integer idDep);

    public List<Etudiant> getEtudiantByDep2(Integer idDep);

}
