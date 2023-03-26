package ar.carlosarielpaz.Portfolio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.carlosarielpaz.Portfolio.Entity.Skill;
import ar.carlosarielpaz.Portfolio.Interface.SkillInterface;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/skill")
public class SkillController {
	@Autowired
	private SkillInterface skillInterface;

	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public List<Skill> list() {
		return skillInterface.list();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/find/{id}")
	public Skill find(@PathVariable Integer id) {
		return skillInterface.find(id);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/create")
	public String create(@RequestBody Skill skill) {
		skillInterface.save(skill);

		return "Create OK!";
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/update")
	public String update(@RequestBody Skill data) {
		Skill skill = skillInterface.find(data.getId());

		skill.setTitle(data.getTitle());
		skill.setPercentage(data.getPercentage());
		skill.setImage(data.getImage());

		skillInterface.save(skill);

		return "Put... OK!";
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/delete/{id}")
	public String delete(@PathVariable Integer id) {
		skillInterface.delete(id);

		return "Delete OK!";
	}
}
