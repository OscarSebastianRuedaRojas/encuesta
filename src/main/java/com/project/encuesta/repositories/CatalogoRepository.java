package com.project.encuesta.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.encuesta.entities.Catalog;

@Repository
public interface CatalogoRepository extends CrudRepository<Catalog, Long>{

}
