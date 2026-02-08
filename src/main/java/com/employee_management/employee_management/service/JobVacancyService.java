package com.employee_management.employee_management.service;

import com.employee_management.employee_management.model.JobVacancy;
import com.employee_management.employee_management.repository.JobVacancyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobVacancyService {
    private JobVacancyRepository jobVacancyRepository;

    public JobVacancyService(JobVacancyRepository jobVacancyRepository){
        this.jobVacancyRepository = jobVacancyRepository;
    }


    public List<JobVacancy> findAll(){
       return jobVacancyRepository.findAll();
    }

    public JobVacancy findById(Long id){
        return jobVacancyRepository.findById(id).orElseThrow(() -> new RuntimeException("Vacancy not found"));
    }

    public JobVacancy addVacancy(JobVacancy vacancy){
        return jobVacancyRepository.save(vacancy);
    }

    public JobVacancy editVacancy(Long id, JobVacancy updatedVacancy){
        JobVacancy vacancy = jobVacancyRepository.findById(id).orElseThrow(() -> new RuntimeException("Vacancy not found"));
        vacancy.setTitle(updatedVacancy.getTitle());
        vacancy.setDescription(updatedVacancy.getDescription());
        vacancy.setRequiredExperience(updatedVacancy.getRequiredExperience());
        vacancy.setHourlyRate(updatedVacancy.getHourlyRate());
        vacancy.setStatus(updatedVacancy.isStatus());
//        vacancy.setRequiredTechnologies(updatedVacancy.getRequiredTechnologies());

        return jobVacancyRepository.save(vacancy);
    }

    public void deleteVacancy(Long id){
        jobVacancyRepository.deleteById(id);
    }



}
