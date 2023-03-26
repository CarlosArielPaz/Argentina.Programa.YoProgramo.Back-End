package ar.carlosarielpaz.Portfolio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.carlosarielpaz.Portfolio.Entity.Project;
import ar.carlosarielpaz.Portfolio.Interface.ProjectInterface;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/project")
public class ProjectController {
	@Autowired
	private ProjectInterface projectInterface;

	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public List<Project> list() {
		return projectInterface.list();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/find/{id}")
	public Project find(@PathVariable Integer id) {
		return projectInterface.find(id);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/create")
	public String create(@RequestBody Project project) {
		projectInterface.save(project);

		return "Create OK!";
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/update")
	public String update(@RequestBody Project data) {
		Project project = projectInterface.find(data.getId());

		project.setName(data.getName());
		project.setDescription(data.getDescription());
		project.setLink(data.getLink());
		project.setPeriod(data.getPeriod());
		project.setImage(data.getImage());

		projectInterface.save(project);

		return "Put... OK!";
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/delete/{id}")
	public String delete(@PathVariable Integer id) {
		projectInterface.delete(id);

		return "Delete OK!";
	}
}