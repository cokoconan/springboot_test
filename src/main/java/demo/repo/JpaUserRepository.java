package demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.domain.User;



public interface JpaUserRepository  extends JpaRepository<User, Long> {
	
	List<User> findAll();
	List<User> findByNameLike(String name);
}
