package com.employee_management.employee_management.repository;

import com.employee_management.employee_management.model.JobVacancy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobVacancyRepository extends JpaRepository<JobVacancy, Long> {

}
