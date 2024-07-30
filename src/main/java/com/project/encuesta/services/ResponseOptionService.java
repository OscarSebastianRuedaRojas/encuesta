package com.project.encuesta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.encuesta.entities.Question;
import com.project.encuesta.entities.ResponseOption;
import com.project.encuesta.repositories.QuestionRepository;
import com.project.encuesta.repositories.ResponseOptionRepository;

@Service
public class ResponseOptionService {
    @Autowired
    private ResponseOptionRepository responseOptionRepository;

    @Autowired
    private QuestionRepository questionRepository;

    public ResponseOption createResponseOption(Long questionId, ResponseOption responseOption) {
        Question question = questionRepository.findById(questionId).orElseThrow(() -> new RuntimeException("Question not found"));
        responseOption.setQuestion(question);
        return responseOptionRepository.save(responseOption);
    }

    public List<ResponseOption> getAllResponseOptions() {
        return (List<ResponseOption>) responseOptionRepository.findAll();
    }

    public ResponseOption getResponseOptionById(Long id) {
        return responseOptionRepository.findById(id).orElseThrow(() -> new RuntimeException("Response option not found"));
    }

    public ResponseOption updateResponseOption(Long id, ResponseOption responseOptionDetails) {
        ResponseOption responseOption = responseOptionRepository.findById(id).orElseThrow(() -> new RuntimeException("Response option not found"));
        responseOption.setOption_value(responseOptionDetails.getOption_value());
        responseOption.setComment_response(responseOptionDetails.getComment_response());
        responseOption.setOption_text(responseOptionDetails.getOption_text());
        return responseOptionRepository.save(responseOption);
    }

    public void deleteResponseOption(Long id) {
        responseOptionRepository.deleteById(id);
    }
}
