package com.example.kommunevalg.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Party {


    @Id
    @GeneratedValue
    private int partyId;

    private String partyName;
    private String partyAbbreviation;


    @OneToMany
    @JoinColumn(name = "party_id")
    @JsonBackReference
    private Set<Candidate> candidates = new HashSet<>();





    public Party() {
    }

    public Party(int partyId, String partyName, String partyAbbreviation) {
        this.partyId = partyId;
        this.partyName = partyName;
        this.partyAbbreviation = partyAbbreviation;
    }

    public int getPartyId() {
        return partyId;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getPartyAbbreviation() {
        return partyAbbreviation;
    }

    public void setPartyAbbreviation(String partyAbbreviation) {
        this.partyAbbreviation = partyAbbreviation;
    }

    public Set<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(Set<Candidate> candidates) {
        this.candidates = candidates;
    }

    @Override
    public String toString() {
        return "Party{" +
                "partyId=" + partyId +
                ", partyName='" + partyName + '\'' +
                ", partyAbbreviation='" + partyAbbreviation + '\'' +
                '}';
    }
}
