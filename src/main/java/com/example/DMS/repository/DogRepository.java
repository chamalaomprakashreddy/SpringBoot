package com.example.DMS.repository;

import java.util.List;
/**
 * @author OmprakashReddy Chamala
 * @author S571661
 */
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	@Query("SELECT d FROM Dog d WHERE d.name LIKE %?1%")
	List<Dog> fingByName(String name);
	

}
