package com.project.encuesta.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.encuesta.entities.ResponseCatalog;

@Repository
public interface ResponseCatalogRepository extends CrudRepository<ResponseCatalog, Long>{

}
