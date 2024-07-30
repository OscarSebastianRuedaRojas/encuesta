package com.project.encuesta.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.encuesta.entities.DetailResponse;

@Repository
public interface DetailResponseRepository extends CrudRepository<DetailResponse, Long>{

}
