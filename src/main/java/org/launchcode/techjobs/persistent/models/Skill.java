package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    /** Fields **/
    @NotNull
    @Size(min = 5, max = 30, message = "skill must be between 5 and 30 characters")
    private String description;

    @ManyToMany(mappedBy="skills")
    List<Job> jobs = new ArrayList<>();


    /** Constructors **/
    public Skill() {

    }

    /** Getters and Setters **/
    public String getDescription() {
        return description;
    }

    public Skill setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public Skill setJobs(List<Job> jobs) {
        this.jobs = jobs;
        return this;
    }
}
