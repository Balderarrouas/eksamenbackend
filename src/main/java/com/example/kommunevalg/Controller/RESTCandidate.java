package com.example.kommunevalg.Controller;


import com.example.kommunevalg.Model.Candidate;
import com.example.kommunevalg.Repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/candidate")
public class RESTCandidate {

    @Autowired
    CandidateRepository candidateRepository;


    @GetMapping("/get")
    public List<Candidate> readCandidates(){

        return candidateRepository.findAll();
    }


    @PostMapping(value="/save", consumes = "application/json")
    public ResponseEntity<Candidate> createCandidate(@RequestBody Candidate candidate){

        candidateRepository.save(candidate);

        return new ResponseEntity<>(candidate, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{candidateId}")
    public ResponseEntity<Candidate> deleteCandidate(@PathVariable int candidateId)  {

        candidateRepository.deleteById(candidateId);


        return ResponseEntity.ok().build();
    }



    @PutMapping("/update/{candidateId}")
    public ResponseEntity<Candidate> updateCandidate(@PathVariable int candidateId, @RequestBody Candidate updatedCandidateObj ){

        Optional<Candidate> optionalObj = candidateRepository.findById(candidateId);


        Candidate myObj = optionalObj.get();



        myObj.setName(updatedCandidateObj.getName());
        myObj.setLastName(updatedCandidateObj.getLastName());
        myObj.setAge(updatedCandidateObj.getAge());




        myObj = candidateRepository.save(myObj);

        return new ResponseEntity<>(myObj, HttpStatus.OK);
    }




}
