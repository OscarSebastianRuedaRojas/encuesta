package com.project.encuesta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question_number;
    private String question_text;
    private String response_type;
    private String comment_question;
    
    @ManyToOne
    private Chapter chapter;

    @ManyToOne
    private Survey survey;

    @ManyToOne
    private Question question;

    
    public Question() {
    }

    public Question(Long id, String question_number, String question_text, String response_type,
            String comment_question, Chapter chapter, Survey survey, Question question) {
        this.id = id;
        this.question_number = question_number;
        this.question_text = question_text;
        this.response_type = response_type;
        this.comment_question = comment_question;
        this.chapter = chapter;
        this.survey = survey;
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion_number() {
        return question_number;
    }

    public void setQuestion_number(String question_number) {
        this.question_number = question_number;
    }

    public String getQuestion_text() {
        return question_text;
    }

    public void setQuestion_text(String question_text) {
        this.question_text = question_text;
    }

    public String getResponse_type() {
        return response_type;
    }

    public void setResponse_type(String response_type) {
        this.response_type = response_type;
    }

    public String getComment_question() {
        return comment_question;
    }

    public void setComment_question(String comment_question) {
        this.comment_question = comment_question;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + ", question_number=" + question_number + ", question_text=" + question_text
                + ", response_type=" + response_type + ", comment_question=" + comment_question + ", chapter=" + chapter
                + ", survey=" + survey + ", question=" + question + "]";
    }

    
}
