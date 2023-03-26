package ar.carlosarielpaz.Portfolio.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.carlosarielpaz.Portfolio.Entity.Skill;
import ar.carlosarielpaz.Portfolio.Interface.SkillInterface;
import ar.carlosarielpaz.Portfolio.Repository.SkillRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class SkillService implements SkillInterface {
	@Autowired
	private SkillRepository skillRepository;

	@Override
	public List<Skill> list() {
		List<Skill> list = skillRepository.findAll();

		return list;
	}

	@Override
	public Skill find(Integer id) {
		Skill skill = skillRepository.findById(id).orElse(null);

		return skill;
	}

	@Override
	public void save(Skill skill) {
		skillRepository.save(skill);
	}

	@Override
	public void delete(Integer id) {
		skillRepository.deleteById(id);
	}
}