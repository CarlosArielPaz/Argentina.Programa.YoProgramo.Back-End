package ar.carlosarielpaz.Portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.carlosarielpaz.Portfolio.Entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}