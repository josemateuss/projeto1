package mateus.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mateus.projeto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByName(String name);
	
	@Query("select u from User u where u.name like %?1%")
	User findByHalfName(String name);
	
	User findByEmail(String email);
	
	User findByNameIgnoreCase(String name);
	
}
