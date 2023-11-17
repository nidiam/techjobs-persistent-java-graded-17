package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
public class Employer extends AbstractEntity {
    @NotNull(message="cannot be empty")
    @Size(min = 5, max = 20, message = "employer must be between 5 and 20 characters")
    private String location;

    public Employer() {

    }

    public String getLocation() {
        return location;
    }

    public Employer setLocation(String location) {
        this.location = location;
        return this;
    }
}
