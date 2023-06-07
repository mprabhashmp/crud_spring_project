package com.mp.project.spring_crud_project_simple.Service;


import com.mp.project.spring_crud_project_simple.Entity.Project;
import com.mp.project.spring_crud_project_simple.Repository.Project_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Project_Service {
    @Autowired
    private Project_repo project_repo;

    public Iterable<Project> getAllProjects(){
        return project_repo.findAll();
    }

    public void saveProjects(Project p){
        project_repo.save(p);
    }

    public Project getProjectById(Long id){
        return project_repo.findById(id).get();
    }

    public void deleteProjectByID(Long id){
        project_repo.deleteById(id);
    }
}
