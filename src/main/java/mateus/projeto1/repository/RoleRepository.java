package mateus.projeto1.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mateus.projeto1.entity.Role;
import mateus.projeto1.entity.StatusRole;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

	Role findByName(String name);
	
	List<Role> findByStatus(StatusRole status);
	
	Page<Role> findAll(Pageable pegebale);
}
