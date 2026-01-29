package com.employee_management.employee_management.controller;

import com.employee_management.employee_management.model.Candidate;
import com.employee_management.employee_management.service.CandidateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {
    private CandidateService candidateService;

    public CandidateController(CandidateService candidateService){
        this.candidateService = candidateService;
    }

    @GetMapping
    public List<Candidate> findAll(){
        return candidateService.findAll();
    }

    @GetMapping("/{id}")
    public Candidate findById(@PathVariable Long id){
        return candidateService.findById(id);
    }

    @PostMapping
    public Candidate addCandidate(@RequestBody Candidate candidate){
        return candidateService.addCandidate(candidate);
    }

    @PutMapping("/{id}")
    public Candidate editCandidate(@PathVariable Long id, @RequestBody Candidate candidate){
        return candidateService.editCandidate(id, candidate);
    }

    @DeleteMapping("/{id}")
        public void deleteCandidate(@PathVariable Long id){
            candidateService.deleteCandidate(id);
        }


}
