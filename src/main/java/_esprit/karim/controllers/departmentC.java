package _esprit.karim.controllers;


import _esprit.karim.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import _esprit.karim.services.departmentS;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/department")
public class departmentC {
    List<Department> de = new ArrayList<Department>();

    @Autowired
    departmentS depS;

    @PostMapping("/addDept")
    public Department addDep(@RequestBody Department d)
    {
        return depS.addDep(d);
    }

    @PutMapping("/editDep")
    public Department updateDep(@RequestBody Department d) {
        return depS.updateDep(d);

    }

    @GetMapping("/retrieveDep/{idDep}")
    public Department retrieveDep(@PathVariable Integer idDep) {
        return depS.retrieveDep(idDep);

    }

    @GetMapping("/listeDep")
    public List<Department> listeDeps() {
        return depS.retrieveAllDeps();
    }
}
