package com.issam.projectmanagment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.issam.projectmanagment.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

}
