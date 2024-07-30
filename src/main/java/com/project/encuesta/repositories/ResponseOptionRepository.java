package com.project.encuesta.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.encuesta.entities.ResponseOption;

@Repository
public interface ResponseOptionRepository extends CrudRepository<ResponseOption, Long>{

}
