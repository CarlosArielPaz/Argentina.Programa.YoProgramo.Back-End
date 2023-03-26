package ar.carlosarielpaz.Portfolio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.carlosarielpaz.Portfolio.Entity.User;
import ar.carlosarielpaz.Portfolio.Interface.UserInterface;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/user")
public class UserController {
	@Autowired
	private UserInterface userInterface;

	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public List<User> list() {
		return userInterface.list();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/find/{id}")
	public User find(@PathVariable Integer id) {
		return userInterface.find(id);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/create")
	public String create(@RequestBody User user) {
		userInterface.save(user);

		return "Create OK!";
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/update")
	public String update(@RequestBody User data) {
		User user = userInterface.find(data.getId());

		user.setName(data.getName());
		user.setDescription(data.getDescription());
		user.setWeb(data.getWeb());
		user.setEmail(data.getEmail());
		user.setVersion(data.getVersion());
		user.setImageProfile(data.getImageProfile());
		user.setImageBackground(data.getImageBackground());

		userInterface.save(user);

		return "Put... OK!";
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/delete/{id}")
	public String delete(@PathVariable Integer id) {
		userInterface.delete(id);

		return "Delete OK!";
	}
}