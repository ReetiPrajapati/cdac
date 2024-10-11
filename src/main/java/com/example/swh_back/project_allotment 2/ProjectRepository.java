//package com.spring.implementation.repository;
package com.example.swh_back.project_allotment;

import com.spring.implementation.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {

}