package ar.carlosarielpaz.Portfolio.Interface;

import java.util.List;

import ar.carlosarielpaz.Portfolio.Entity.Project;

public interface ProjectInterface {
	public List<Project> list();

	public Project find(Integer id);

	public void save(Project project);

	public void delete(Integer id);
}