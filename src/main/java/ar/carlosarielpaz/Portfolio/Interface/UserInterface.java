package ar.carlosarielpaz.Portfolio.Interface;

import java.util.List;

import ar.carlosarielpaz.Portfolio.Entity.User;

public interface UserInterface {
	public List<User> list();

	public User find(Integer id);

	public void save(User user);

	public void delete(Integer id);
}