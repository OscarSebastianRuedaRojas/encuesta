package com.project.encuesta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "resposne_options")
public class ResponseOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String option_value;
    private String comment_response;
    private String option_text;
    private Integer question_parent;

    @ManyToOne
    private Question question;

    public ResponseOption() {
    }

    public ResponseOption(Long id, String option_value, String comment_response, String option_text,
            Integer question_parent, Question question) {
        this.id = id;
        this.option_value = option_value;
        this.comment_response = comment_response;
        this.option_text = option_text;
        this.question_parent = question_parent;
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOption_value() {
        return option_value;
    }

    public void setOption_value(String option_value) {
        this.option_value = option_value;
    }

    public String getComment_response() {
        return comment_response;
    }

    public void setComment_response(String comment_response) {
        this.comment_response = comment_response;
    }

    public String getOption_text() {
        return option_text;
    }

    public void setOption_text(String option_text) {
        this.option_text = option_text;
    }

    public Integer getQuestion_parent() {
        return question_parent;
    }

    public void setQuestion_parent(Integer question_parent) {
        this.question_parent = question_parent;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "ResponseOption [id=" + id + ", option_value=" + option_value + ", comment_response=" + comment_response
                + ", option_text=" + option_text + ", question_parent=" + question_parent + ", question=" + question
                + "]";
    }

    
}
