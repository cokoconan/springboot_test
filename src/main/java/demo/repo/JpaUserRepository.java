package demo.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import demo.domain.User;


@Repository
public class JpaUserRepository implements UserRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	UserRepository repo;
	
	@Override
	public List<User> findAll() {
		//return this.entityManager.createQuery("SELECT n FROM User n", User.class).getResultList();
		
		return this.repo.findAll();
	}

}
