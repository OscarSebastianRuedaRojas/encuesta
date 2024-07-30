package com.project.encuesta.entities;

import java.security.Timestamp;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "responses")
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Time response_time;
    private Timestamp response_date;
    private String name_respondent;

    @ManyToOne
    private Survey survey;

    @OneToMany(mappedBy = "response", cascade = CascadeType.ALL)
    private List<ResponseCatalog> responseCatalogs = new ArrayList<>();

    @OneToMany(mappedBy = "response", cascade = CascadeType.ALL)
    private List<ResponseOption> responseOptions = new ArrayList<>();

    public Response() {
    }

    
    public Response(Long id, Time response_time, Timestamp response_date, String name_respondent, Survey survey) {
        this.id = id;
        this.response_time = response_time;
        this.response_date = response_date;
        this.name_respondent = name_respondent;
        this.survey = survey;
    }


    public List<ResponseCatalog> getResponseCatalogs() {
        return responseCatalogs;
    }


    public void setResponseCatalogs(List<ResponseCatalog> responseCatalogs) {
        this.responseCatalogs = responseCatalogs;
    }


    public List<ResponseOption> getResponseOptions() {
        return responseOptions;
    }


    public void setResponseOptions(List<ResponseOption> responseOptions) {
        this.responseOptions = responseOptions;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Time getResponse_time() {
        return response_time;
    }

    public void setResponse_time(Time response_time) {
        this.response_time = response_time;
    }

    public Timestamp getResponse_date() {
        return response_date;
    }

    public void setResponse_date(Timestamp response_date) {
        this.response_date = response_date;
    }

    public String getName_respondent() {
        return name_respondent;
    }

    public void setName_respondent(String name_respondent) {
        this.name_respondent = name_respondent;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }


    @Override
    public String toString() {
        return "Response [id=" + id + ", response_time=" + response_time + ", response_date=" + response_date
                + ", name_respondent=" + name_respondent + ", survey=" + survey + "]";
    }

    
}
