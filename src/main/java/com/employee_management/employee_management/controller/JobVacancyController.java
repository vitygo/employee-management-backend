package com.employee_management.employee_management.controller;


import com.employee_management.employee_management.model.JobVacancy;
import com.employee_management.employee_management.service.JobVacancyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobvacancies")
@CrossOrigin(origins = "http://localhost:5174")
public class JobVacancyController {

    private JobVacancyService jobVacancyService;

    public JobVacancyController(JobVacancyService jobVacancyService){
        this.jobVacancyService = jobVacancyService;
    }

    @GetMapping
    public List<JobVacancy> getAllVacancy(){
        return jobVacancyService.findAll();
    }

    @GetMapping("/{id}")
    public JobVacancy findById(@PathVariable Long id){
        return jobVacancyService.findById(id);
    }

    @PostMapping
    public JobVacancy addVacancy(@RequestBody JobVacancy vacancy){
       return jobVacancyService.addVacancy(vacancy);

    }
    @PutMapping("/{id}")
    public JobVacancy editVacancy(@PathVariable Long id, @RequestBody JobVacancy vacancy){
        return jobVacancyService.editVacancy(id, vacancy);
    }

    @DeleteMapping("/{id}")
    public void deleteVacancy(@PathVariable Long id){
        jobVacancyService.deleteVacancy(id);
    }
}
