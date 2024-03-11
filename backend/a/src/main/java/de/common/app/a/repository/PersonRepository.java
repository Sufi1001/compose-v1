package de.common.app.a.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import de.common.app.a.entity.Person;


public interface PersonRepository extends JpaRepository<Person, Integer> {
    
	List<Person> findAll();
	
}