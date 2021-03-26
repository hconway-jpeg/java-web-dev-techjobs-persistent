package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size(max = 125, message = "Must not be longer than 125 characters")
    private String location;

    // cascading allows for employer updates to be sent to the employers jobs as well??
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();

    public Employer() {}

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

}
