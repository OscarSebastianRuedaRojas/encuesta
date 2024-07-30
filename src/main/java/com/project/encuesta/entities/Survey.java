package com.project.encuesta.entities;

import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "surveys")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp create_at;
    private Timestamp updated_at;
    private String description;
    private String name;
    
    public Survey() {
    }
    
    public Survey(Long id, Timestamp create_at, Timestamp updated_at, String description, String name) {
        this.id = id;
        this.create_at = create_at;
        this.updated_at = updated_at;
        this.description = description;
        this.name = name;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Timestamp getCreate_at() {
        return create_at;
    }
    public void setCreate_at(Timestamp create_at) {
        this.create_at = create_at;
    }
    public Timestamp getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Survey [id=" + id + ", create_at=" + create_at + ", updated_at=" + updated_at + ", description="
                + description + ", name=" + name + "]";
    }
    
    
}
