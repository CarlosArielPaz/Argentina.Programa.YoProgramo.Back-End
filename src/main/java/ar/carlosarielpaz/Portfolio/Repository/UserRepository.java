package ar.carlosarielpaz.Portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.carlosarielpaz.Portfolio.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}