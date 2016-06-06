package com.followbuyme.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.followbuyme.project.model.BuildingProject;
import com.followbuyme.project.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping("/details")
	public BuildingProject getProjectDetail(@RequestParam(value = "id",required = true,defaultValue = "1") Long id) throws Exception {
		BuildingProject p = projectService.getProjectDetails(id);
		return p;
	}
	
	@RequestMapping(value="/create", method = RequestMethod.POST)
	@ResponseBody
	public void createProject(@RequestBody BuildingProject input) {
		try {
			projectService.createProject(input);
			
		} catch (Exception e) {
			// e.printStackTrace();
		}

	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	@ResponseBody
	public void updateProject(@RequestBody BuildingProject input) {
		try {
			projectService.updateProject(input);
			
		} catch (Exception e) {
			// e.printStackTrace();
		}

	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	@ResponseBody
	public void deleteProject(@RequestParam(value = "id",required = true) Long id) {
		try {
			projectService.deleteProject(id, BuildingProject.class);
			
		} catch (Exception e) {
			// e.printStackTrace();
		}

	}
	
}