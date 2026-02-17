package com.employee_management.employee_management.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class JobVacancy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String requiredExperience;
    private BigDecimal hourlyRate;
    private String dateCreated;
    private String location;
    private int candidateAmount;
    private boolean status;

    public int getCandidateAmount() {
        return candidateAmount;
    }

    public void setCandidateAmount(int candidateAmount) {
        this.candidateAmount = candidateAmount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
//    @ManyToMany
//    @JoinTable(
//            name = "job_required_technologies",
//            joinColumns = @JoinColumn(name = "job_id"),
//            inverseJoinColumns = @JoinColumn(name = "technology_id")
//    )
//    private List<Technology> requiredTechnologies;

    public Long getId() {
        return id;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequiredExperience() {
        return requiredExperience;
    }

    public void setRequiredExperience(String requiredExperience) {
        this.requiredExperience = requiredExperience;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

//    public List<Technology> getRequiredTechnologies() {
//        return requiredTechnologies;
//    }
//
//    public void setRequiredTechnologies(List<Technology> requiredTechnologies) {
//        requiredTechnologies = requiredTechnologies;
//    }
}
