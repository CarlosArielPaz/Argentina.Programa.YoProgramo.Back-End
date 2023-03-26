package ar.carlosarielpaz.Portfolio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.carlosarielpaz.Portfolio.Entity.Experience;
import ar.carlosarielpaz.Portfolio.Interface.ExperienceInterface;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/experience")
public class ExperienceController {
	@Autowired
	private ExperienceInterface experienceInterface;

	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public List<Experience> list() {
		return experienceInterface.list();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/find/{id}")
	public Experience find(@PathVariable Integer id) {
		return experienceInterface.find(id);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/create")
	public String create(@RequestBody Experience experience) {
		experienceInterface.save(experience);

		return "Create OK!";
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/update")
	public String update(@RequestBody Experience data) {
		Experience experience = experienceInterface.find(data.getId());

		experience.setTitle(data.getTitle());
		experience.setDescription(data.getDescription());
		experience.setPeriod(data.getPeriod());
		experience.setImage(data.getImage());

		experienceInterface.save(experience);

		return "Put... OK!";
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/delete/{id}")
	public String delete(@PathVariable Integer id) {
		experienceInterface.delete(id);

		return "Delete OK!";
	}
}
