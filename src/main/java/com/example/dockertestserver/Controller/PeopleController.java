package com.example.dockertestserver.Controller;



import com.example.dockertestserver.Model.People;
import com.example.dockertestserver.Repository.PeopleRepository;
import com.example.dockertestserver.Service.DatabaseConnector;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

    private PeopleRepository peopleRepository;

    public PeopleController(PeopleRepository peopleRepository){
        this.peopleRepository = peopleRepository;}

    @GetMapping("/")
    public ResponseEntity<People> people(){
        People people = new People("Johnny");
        peopleRepository.save(people);
        return new ResponseEntity<>(people, HttpStatus.OK);

    }



}
