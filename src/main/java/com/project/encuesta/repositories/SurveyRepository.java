package com.project.encuesta.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.encuesta.entities.Survey;

@Repository
public interface SurveyRepository extends CrudRepository<Survey, Long>{

}
