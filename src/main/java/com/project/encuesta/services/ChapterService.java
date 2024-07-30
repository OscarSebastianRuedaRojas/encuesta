package com.project.encuesta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.encuesta.entities.Chapter;
import com.project.encuesta.entities.Survey;
import com.project.encuesta.repositories.ChapterRepository;
import com.project.encuesta.repositories.SurveyRepository;

@Service
public class ChapterService {
    @Autowired
    private ChapterRepository chapterRepository;

    @Autowired
    private SurveyRepository surveyRepository;

    public Chapter createChapter(Long surveyId, Chapter chapter) {
        Survey survey = surveyRepository.findById(surveyId).orElseThrow(() -> new RuntimeException("Survey not found"));
        chapter.setSurvey(survey);
        return chapterRepository.save(chapter);
    }

    public List<Chapter> getAllChapters() {
        return (List<Chapter>) chapterRepository.findAll();
    }

    public Chapter getChapterById(Long id) {
        return chapterRepository.findById(id).orElseThrow(() -> new RuntimeException("Chapter not found"));
    }

    public Chapter updateChapter(Long id, Chapter chapterDetails) {
        Chapter chapter = chapterRepository.findById(id).orElseThrow(() -> new RuntimeException("Chapter not found"));
        chapter.setChapter_number(chapterDetails.getChapter_number());
        chapter.setChapter_number(chapterDetails.getChapter_number());
        return chapterRepository.save(chapter);
    }

    public void deleteChapter(Long id) {
        chapterRepository.deleteById(id);
    }
}
