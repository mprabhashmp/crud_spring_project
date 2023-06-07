package com.mp.project.spring_crud_project_simple.Repository;

import com.mp.project.spring_crud_project_simple.Entity.Project;
import org.springframework.data.repository.CrudRepository;

public interface Project_repo extends CrudRepository<Project,Long> {
}
