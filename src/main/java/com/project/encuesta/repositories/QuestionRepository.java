package com.project.encuesta.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.encuesta.entities.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long>{

}
