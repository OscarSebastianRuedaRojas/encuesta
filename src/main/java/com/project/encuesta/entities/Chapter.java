package com.project.encuesta.entities;

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
@Table(name = "chapter")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String chapter_number;
    private String chapter_title;

    @ManyToOne
    private Survey survey;
    
    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL)
    private List<Question> questions = new ArrayList<>();
    
    public Chapter() {
    }

    public Chapter(Long id, String chapter_number, String chapter_title, Survey survey) {
        this.id = id;
        this.chapter_number = chapter_number;
        this.chapter_title = chapter_title;
        this.survey = survey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChapter_number() {
        return chapter_number;
    }

    public void setChapter_number(String chapter_number) {
        this.chapter_number = chapter_number;
    }

    public String getChapter_title() {
        return chapter_title;
    }

    public void setChapter_title(String chapter_title) {
        this.chapter_title = chapter_title;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    @Override
    public String toString() {
        return "Chapter [id=" + id + ", chapter_number=" + chapter_number + ", chapter_title=" + chapter_title
                + ", survey=" + survey + "]";
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
    
}
