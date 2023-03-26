package ar.carlosarielpaz.Portfolio.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.carlosarielpaz.Portfolio.Entity.Education;
import ar.carlosarielpaz.Portfolio.Interface.EducationInterface;
import ar.carlosarielpaz.Portfolio.Repository.EducationRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class EducationService implements EducationInterface {
	@Autowired
	private EducationRepository educationRepository;

	@Override
	public List<Education> list() {
		List<Education> list = educationRepository.findAll();

		return list;
	}

	@Override
	public Education find(Integer id) {
		Education education = educationRepository.findById(id).orElse(null);

		return education;
	}

	@Override
	public void save(Education education) {
		educationRepository.save(education);
	}

	@Override
	public void delete(Integer id) {
		educationRepository.deleteById(id);
	}
}