package ar.carlosarielpaz.Portfolio.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.carlosarielpaz.Portfolio.Entity.User;
import ar.carlosarielpaz.Portfolio.Interface.UserInterface;
import ar.carlosarielpaz.Portfolio.Repository.UserRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService implements UserInterface {
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> list() {
		List<User> list = userRepository.findAll();

		return list;
	}

	@Override
	public User find(Integer id) {
		User user = userRepository.findById(id).orElse(null);

		return user;
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
	}

	@Override
	public void delete(Integer id) {
		userRepository.deleteById(id);
	}
}