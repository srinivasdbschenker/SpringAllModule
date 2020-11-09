package com.nt.repo;
import com.nt.entity.*;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository                        //MongoRepository<Person,Long>
public interface PersonDAO extends CrudRepository<Person,Long>{
	
	public List<Person> findByFullNameLike(String name);
	
	public List<Person> findByDateOfBirthGreaterThan(Date date);

}
