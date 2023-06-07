package com.mp.project.spring_crud_project_simple.Control;

import com.mp.project.spring_crud_project_simple.Entity.Project;
import com.mp.project.spring_crud_project_simple.Service.Project_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Project_Controller {

    @Autowired
    private Project_Service projectService;

    @RequestMapping("/")
    public String viewHomePage(Model mod){
        Iterable<Project> projList = projectService.getAllProjects();
        mod.addAttribute("projectList",projList);
        return "project_home";

    }

    @RequestMapping("/new")
    public String showNewProjectPage(Model model){
        Project proj = new Project();
        model.addAttribute("newProject",proj);
        return "new_project";
    }

    @RequestMapping("/save")
    public String saveProject(@ModelAttribute("newProject")Project proj){
        projectService.saveProjects(proj);

        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProjectPage(@PathVariable(name = "id") Long id){
        ModelAndView mav = new ModelAndView("edit_project");
        Project proj = projectService.getProjectById(id);
        mav.addObject("editproject",proj);

        return mav;
    }

    @RequestMapping("/delete/{id}")
    public  String deleteProject(@PathVariable(name="id")Long id){
        projectService.deleteProjectByID(id);
        return "redirect:/";
    }


}
