package com.project.encuesta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.encuesta.entities.Chapter;
import com.project.encuesta.entities.Question;
import com.project.encuesta.repositories.ChapterRepository;
import com.project.encuesta.repositories.QuestionRepository;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private ChapterRepository chapterRepository;

    public Question createQuestion(Long chapterId, Question question) {
        Chapter chapter = chapterRepository.findById(chapterId).orElseThrow(() -> new RuntimeException("Chapter not found"));
        question.setChapter(chapter);
        return questionRepository.save(question);
    }

    public List<Question> getAllQuestions() {
        return (List<Question>) questionRepository.findAll();
    }

    public Question getQuestionById(Long id) {
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found"));
    }

    public Question updateQuestion(Long id, Question questionDetails) {
        Question question = questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found"));
        question.setQuestion_number(questionDetails.getQuestion_number());
        question.setQuestion_text(questionDetails.getQuestion_text());
        question.setResponse_type(questionDetails.getResponse_type());
        question.setComment_question(questionDetails.getComment_question());
        return questionRepository.save(question);
    }

    public void deleteQuestion(Long id) {
        questionRepository.deleteById(id);
    }
}
