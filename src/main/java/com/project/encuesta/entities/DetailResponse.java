package com.project.encuesta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detail_responses")
public class DetailResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer response_option;
    private String response_text;

    @ManyToOne
    private Question question;

    @ManyToOne
    private Response response;

    
    public DetailResponse() {
    }

    
    public DetailResponse(Long id, Integer response_option, String response_text, Question question,
            Response response) {
        this.id = id;
        this.response_option = response_option;
        this.response_text = response_text;
        this.question = question;
        this.response = response;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getResponse_option() {
        return response_option;
    }

    public void setResponse_option(Integer response_option) {
        this.response_option = response_option;
    }

    public String getResponse_text() {
        return response_text;
    }

    public void setResponse_text(String response_text) {
        this.response_text = response_text;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }


    @Override
    public String toString() {
        return "DetailResponse [id=" + id + ", response_option=" + response_option + ", response_text=" + response_text
                + ", question=" + question + ", response=" + response + "]";
    }

    
}
