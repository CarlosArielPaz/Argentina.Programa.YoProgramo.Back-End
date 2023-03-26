package ar.carlosarielpaz.Portfolio.Interface;

import java.util.List;

import ar.carlosarielpaz.Portfolio.Entity.Experience;

public interface ExperienceInterface {
	public List<Experience> list();

	public Experience find(Integer id);

	public void save(Experience experience);

	public void delete(Integer id);
}