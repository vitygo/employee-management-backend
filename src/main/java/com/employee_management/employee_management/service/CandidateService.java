package com.employee_management.employee_management.service;

import com.employee_management.employee_management.model.Candidate;
import com.employee_management.employee_management.repository.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    private CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository){
        this.candidateRepository = candidateRepository;

    }

    public List<Candidate> findAll(){
        return candidateRepository.findAll();
    }

    public Candidate findById(Long id){
        return candidateRepository.findById(id).orElseThrow(()-> new RuntimeException("Candidate not found"));
    }

    public Candidate addCandidate(Candidate candidate){
        return candidateRepository.save(candidate);
    }
    public Candidate editCandidate(Long id, Candidate udpatedCandidate){
        Candidate candidate = candidateRepository.findById(id).orElseThrow(() -> new RuntimeException("Candidate not found"));

        candidate.setFirstName(udpatedCandidate.getFirstName());
        candidate.setSurname(udpatedCandidate.getSurname());
        candidate.setBirthDate(udpatedCandidate.getBirthDate());
        candidate.setEmail(udpatedCandidate.getEmail());
        candidate.setPhone(udpatedCandidate.getPhone());
        candidate.setCity(udpatedCandidate.getCity());
        candidate.setEducation(udpatedCandidate.getEducation());
        candidate.setSkills(udpatedCandidate.getSkills());

        return candidateRepository.save(candidate);

    }
    public void deleteCandidate(Long id){
       candidateRepository.deleteById(id);
    }
}
