package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size(max = 125)
    private String location;

    public Employer() {}

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

}
