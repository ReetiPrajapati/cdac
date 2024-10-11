//package com.spring.implementation.controller;
package com.example.swh_back.project_allotment;

import com.spring.implementation.model.Project;
import com.spring.implementation.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/projectAssignment")


public class ProjectAssignmentController {


    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("/getAllProjects")
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @PostMapping("/addProject")
    public ResponseEntity<Project> addProject(@RequestBody Project project) {
        Project savedProject = projectRepository.save(project);
        return new ResponseEntity<>(savedProject, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteProject/{projectName}")
    public ResponseEntity<Void> deleteProject(@PathVariable String projectName) {
        Optional<Project> project = projectRepository.findById(projectName);
        if (project.isPresent()) {
            projectRepository.delete(project.get());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/allot/{projectName}")
    public ResponseEntity<Project> allotProjectToStudents(
            @PathVariable String projectName,
            @RequestBody List<String> students) {

        Optional<Project> project = projectRepository.findById(projectName);

        if (project.isPresent()) {
            Project existingProject = project.get();

            existingProject.setIsAssigned(true);
            existingProject.setStudents(String.join(",", students));

            Project updatedProject = projectRepository.save(existingProject);

            return new ResponseEntity<>(updatedProject, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
