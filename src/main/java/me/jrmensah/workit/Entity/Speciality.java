package me.jrmensah.workit.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Speciality
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=1)
    private String exercise;

    @NotNull
    @Size(min=1)
    private String experiance;

    @NotNull
    @Size(min=1)
    private String description;

    @ManyToMany(mappedBy = "specialities")
    private Set<Trainer> training;

    public Speciality() {
    }

    public Speciality(String exercise, String experiance, String description) {
        this.exercise = exercise;
        this.experiance = experiance;
        this.description = description;
        this.training=new HashSet<Trainer>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getExperiance() {
        return experiance;
    }

    public void setExperiance(String experiance) {
        this.experiance = experiance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Trainer> getTraining() {
        return training;
    }

    public void setTraining(Set<Trainer> training) {
        this.training = training;
    }
}
