package com.issam.projectmanagment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.issam.projectmanagment.domain.Project;
import com.issam.projectmanagment.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	
	public void saveOrUpdateProject(Project project) {
		//Logic here
		projectRepository.save(project);
	}
	

}
