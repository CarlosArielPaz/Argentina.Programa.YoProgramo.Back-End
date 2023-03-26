package ar.carlosarielpaz.Portfolio.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.carlosarielpaz.Portfolio.Entity.Experience;
import ar.carlosarielpaz.Portfolio.Interface.ExperienceInterface;
import ar.carlosarielpaz.Portfolio.Repository.ExperienceRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ExperienceService implements ExperienceInterface {
	@Autowired
	private ExperienceRepository experienceRepository;

	@Override
	public List<Experience> list() {
		List<Experience> list = experienceRepository.findAll();

		return list;
	}

	@Override
	public Experience find(Integer id) {
		Experience experience = experienceRepository.findById(id).orElse(null);

		return experience;
	}

	@Override
	public void save(Experience experience) {
		experienceRepository.save(experience);
	}

	@Override
	public void delete(Integer id) {
		experienceRepository.deleteById(id);
	}
}
