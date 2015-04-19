package demo.repo;

import java.util.List;

import demo.domain.User;


public interface UserRepository {
	
	List<User> findAll();


}
