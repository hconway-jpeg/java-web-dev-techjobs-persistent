package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(max = 300, message = "Must not be longer than 300 characters")
    private String description;

    public Skill() {}

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}