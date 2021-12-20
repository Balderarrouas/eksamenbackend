package com.example.kommunevalg.Repository;

import com.example.kommunevalg.Model.Candidate;
import com.example.kommunevalg.Model.Party;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepository extends JpaRepository<Party, Integer> {
}
