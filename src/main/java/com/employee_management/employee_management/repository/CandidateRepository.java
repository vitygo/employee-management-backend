package com.employee_management.employee_management.repository;

import com.employee_management.employee_management.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
