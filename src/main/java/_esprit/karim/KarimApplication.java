package _esprit.karim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KarimApplication {

    public static void main(String[] args) {
        SpringApplication.run(KarimApplication.class, args);
    }
    // ioc = inversion of control
    // id - injection of dependencies
    //all the methods r transactional now meaning its either they went all in or its abck back to initial state
    //spring data jpa will take care of accessing the data
    //@Service to create an instance of a class

}
