package com.followbuyme.project.service;

import com.followbuyme.project.model.BuildingProject;


public interface ProjectService {
  public BuildingProject getProjectDetails(Long id) throws Exception;
  public void createProject(BuildingProject input) throws Exception;
  public BuildingProject updateProject(BuildingProject input) throws Exception;
  public void deleteProject(Long id, Class<?> clazz) throws Exception;
}
