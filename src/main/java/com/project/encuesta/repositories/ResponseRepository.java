package com.project.encuesta.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.encuesta.entities.Response;

@Repository
public interface ResponseRepository extends CrudRepository<Response, Long>{

}
