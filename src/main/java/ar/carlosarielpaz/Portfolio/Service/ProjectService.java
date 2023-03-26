package ar.carlosarielpaz.Portfolio.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.carlosarielpaz.Portfolio.Entity.Project;
import ar.carlosarielpaz.Portfolio.Interface.ProjectInterface;
import ar.carlosarielpaz.Portfolio.Repository.ProjectRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProjectService implements ProjectInterface {
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public List<Project> list() {
		List<Project> list = projectRepository.findAll();

		return list;
	}

	@Override
	public Project find(Integer id) {
		Project project = projectRepository.findById(id).orElse(null);

		return project;
	}

	@Override
	public void save(Project project) {
		projectRepository.save(project);
	}

	@Override
	public void delete(Integer id) {
		projectRepository.deleteById(id);
	}
}