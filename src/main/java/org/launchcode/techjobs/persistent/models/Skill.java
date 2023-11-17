package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
public class Skill extends AbstractEntity {
    @NotNull
    @Size(min = 5, max = 30, message = "skill must be between 5 and 30 characters")
    private String description;

    public Skill() {

    }

    public String getDescription() {
        return description;
    }

    public Skill setDescription(String description) {
        this.description = description;
        return this;
    }
}
