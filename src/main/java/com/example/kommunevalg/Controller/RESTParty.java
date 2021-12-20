package com.example.kommunevalg.Controller;

import com.example.kommunevalg.Model.Candidate;
import com.example.kommunevalg.Model.Party;
import com.example.kommunevalg.Repository.CandidateRepository;
import com.example.kommunevalg.Repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@CrossOrigin
@RequestMapping("/party")
public class RESTParty {


    @Autowired
    PartyRepository partyRepository;


    @GetMapping("/get")
    public List<Party> readParty(){

        return partyRepository.findAll();
    }


    @PostMapping(value="/save", consumes = "application/json")
    public ResponseEntity<Party> createParty(@RequestBody Party party){

        partyRepository.save(party);

        return new ResponseEntity<>(party, HttpStatus.CREATED);
    }



}
