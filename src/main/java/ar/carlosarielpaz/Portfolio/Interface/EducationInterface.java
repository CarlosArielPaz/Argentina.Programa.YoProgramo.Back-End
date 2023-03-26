package ar.carlosarielpaz.Portfolio.Interface;

import java.util.List;

import ar.carlosarielpaz.Portfolio.Entity.Education;

public interface EducationInterface {
	public List<Education> list();

	public Education find(Integer id);

	public void save(Education education);

	public void delete(Integer id);
}