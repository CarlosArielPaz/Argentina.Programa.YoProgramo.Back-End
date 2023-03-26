package ar.carlosarielpaz.Portfolio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.carlosarielpaz.Portfolio.Entity.Education;
import ar.carlosarielpaz.Portfolio.Interface.EducationInterface;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/education")
public class EducationController {
	@Autowired
	private EducationInterface educationInterface;

	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public List<Education> list() {
		return educationInterface.list();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/find/{id}")
	public Education find(@PathVariable Integer id) {
		return educationInterface.find(id);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/create")
	public String create(@RequestBody Education education) {
		educationInterface.save(education);

		return "Create OK!";
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/update")
	public String update(@RequestBody Education data) {
		Education education = educationInterface.find(data.getId());

		education.setInstitute(data.getInstitute());
		education.setTitle(data.getTitle());
		education.setDescription(data.getDescription());
		education.setPeriod(data.getPeriod());
		education.setImage(data.getImage());

		educationInterface.save(education);

		return "Put... OK!";
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/delete/{id}")
	public String delete(@PathVariable Integer id) {
		educationInterface.delete(id);

		return "Delete OK!";
	}
}