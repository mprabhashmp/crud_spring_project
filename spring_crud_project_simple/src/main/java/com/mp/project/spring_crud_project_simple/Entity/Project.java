package com.mp.project.spring_crud_project_simple.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue

    private Long id;
    private String title;
    private String Coordinator;



    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getCoordinator () {
        return Coordinator;
    }

    public void setCoordinator (String coordinator) {
        Coordinator = coordinator;
    }

    @Override
    public String toString () {
        return "project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", Coordinator='" + Coordinator + '\'' +
                '}';
    }
}
