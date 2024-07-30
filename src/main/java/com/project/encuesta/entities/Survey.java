package com.project.encuesta.entities;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "surveys")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String name;
    
    @OneToMany(mappedBy = "survey", cascade = CascadeType.ALL)
    private List<Response> responses = new ArrayList<>();

    @OneToMany(mappedBy = "survey", cascade = CascadeType.ALL)
    private List<Question> questions = new ArrayList<>();

    @Embedded
    Audit audit = new Audit();
    
    public Survey() {
    }


    public Survey(Long id, String description, String name, Audit audit) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.audit = audit;
    }

    public List<Response> getResponses() {
        return responses;
    }


    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }


    public List<Question> getQuestions() {
        return questions;
    }


    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }
    
    
    
    
}
