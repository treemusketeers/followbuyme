package com.followbuyme.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.followbuyme.project.model.BuildingProject;
import com.threemusketeers.followbuyme.project.bo.BuildingProjectBO;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	BuildingProjectBO buildingProjectBO;
	
	@Override
	public BuildingProject getProjectDetails(Long id) throws Exception {
		return buildingProjectBO.retrieveById(id);
	}
	@Override
	public void createProject(BuildingProject input) throws Exception{
		buildingProjectBO.create(input);
	}
	
	@Override
	public BuildingProject updateProject(BuildingProject input) throws Exception{
		return buildingProjectBO.update(input);
	}
	
	@Override
	public void deleteProject(Long id,Class<?> clazz) throws Exception{
		buildingProjectBO.delete(id,clazz);
	}
	
	
}
