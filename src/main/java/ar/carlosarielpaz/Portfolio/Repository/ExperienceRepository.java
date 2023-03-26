package ar.carlosarielpaz.Portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.carlosarielpaz.Portfolio.Entity.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Integer> {

}