package ar.carlosarielpaz.Portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.carlosarielpaz.Portfolio.Entity.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Integer> {

}