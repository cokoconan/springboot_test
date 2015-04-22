package demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import demo.domain.User;



public interface JpaUserRepository  extends CrudRepository<User, Long> {
	
	List<User> findAll();

}
