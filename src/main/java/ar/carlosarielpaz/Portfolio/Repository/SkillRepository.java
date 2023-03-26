package ar.carlosarielpaz.Portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.carlosarielpaz.Portfolio.Entity.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {

}