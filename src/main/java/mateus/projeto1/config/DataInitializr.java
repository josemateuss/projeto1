package mateus.projeto1.config;

import java.util.List;

//import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import mateus.projeto1.entity.User;
import mateus.projeto1.entity.Role;
import mateus.projeto1.entity.StatusRole;
import mateus.projeto1.repository.RoleRepository;
import mateus.projeto1.repository.UserRepository;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		List<User> users = userRepository.findAll();

		if (users.isEmpty()) {

			/*createRole("Professor");
			createRole("Student");*/
			
			Role role = new Role();
			Role role2 = new Role();
			
			role.setName("Professor");
			role.setStatus(StatusRole.ACTIVE);
			role2.setName("Student");
			role2.setStatus(StatusRole.INACTIVE);
			
			this.roleRepository.save(role);
			this.roleRepository.save(role2);			

			createUser("José Mateus", "mateus.18.santos@gmail.com", role);
			createUser("Geane Cavalcante", "geane@gmail.com", role2);

			// User user = userRepository.getOne((long) 2); //coverter o int pra long ou usa
			// '2L'
			// user.setName("Geane Pereira");

			//userRepository.save(user);
			// System.out.println(user.getName());

		}

		User user;
		// user = userRepository.findByHalfName("Jo");
		user = userRepository.findByEmail("mateus.18.santos@gmail.com");
		System.out.println(user.getName());
		
		List<Role> roles = this.roleRepository.findByStatus(StatusRole.ACTIVE);

		for (Role role : roles) {
			System.out.println(role);
		}

	}

	public void createUser(String name, String email, Role role) {
		User user = new User(name, email, role);
		userRepository.save(user);
	}

	public void createRole(String name) {
		Role role = new Role(name);
		roleRepository.save(role);
	}

}
