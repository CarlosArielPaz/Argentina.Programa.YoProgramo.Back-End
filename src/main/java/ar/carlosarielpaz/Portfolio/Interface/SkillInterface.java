package ar.carlosarielpaz.Portfolio.Interface;

import java.util.List;

import ar.carlosarielpaz.Portfolio.Entity.Skill;

public interface SkillInterface {
	public List<Skill> list();

	public Skill find(Integer id);

	public void save(Skill skill);

	public void delete(Integer id);
}