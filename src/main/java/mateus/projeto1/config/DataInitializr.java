package mateus.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import mateus.projeto1.entity.User;
import mateus.projeto1.repository.UserRepository;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		List<User> users = userRepository.findAll();

		if (users.isEmpty()) {

			createUser("José Mateus", "mateus.18.santos@gmail.com");
			createUser("Geane Cavalcante", "geane@gmail.com");

			// User user = userRepository.getOne((long) 2); //coverter o int pra long ou usa '2L'
			// user.setName("Geane Pereira");

			// userRepository.save(user);
			// System.out.println(user.getName());

		}

		User user;
		// user = userRepository.findByHalfName("Jo");
		user = userRepository.findByEmail("mateus.18.santos@gmail.com");
		System.out.println(user.getName());

	}

	public void createUser(String name, String email) {

		User user = new User(name, email);
		userRepository.save(user);
	}

}
