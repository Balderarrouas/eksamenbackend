package com.example.kommunevalg.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Candidate {







    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int candidateId;

    private String name;
    private String lastName;
    private int age;


    @ManyToOne
    @JoinColumn(name = "party_id")
    private Party party;


    public Candidate() {
    }


    public Candidate(int candidateId, String name, String lastName, int age) {
        this.candidateId = candidateId;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }
    @Override
    public String toString() {
        return "Candidate{" +
                "candidateId=" + candidateId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }


    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }
}
