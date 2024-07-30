package com.project.encuesta.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.encuesta.entities.Chapter;

@Repository
public interface ChapterRepository extends CrudRepository<Chapter, Long>{

}
