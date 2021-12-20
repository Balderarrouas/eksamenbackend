package com.example.kommunevalg.Repository;

import com.example.kommunevalg.Model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
}
