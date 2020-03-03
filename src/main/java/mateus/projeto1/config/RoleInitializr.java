package mateus.projeto1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import mateus.projeto1.entity.Role;
import mateus.projeto1.entity.StatusRole;
import mateus.projeto1.repository.RoleRepository;

@Component
public class RoleInitializr implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	RoleRepository roleRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		for (int i = 0; i < 20; i++) {
			saveRole("Admin", StatusRole.ACTIVE);
		}
		
		for (int i = 0; i < 20; i++) {
			saveRole("Owner", StatusRole.INACTIVE);
		}
		
		PageRequest page = PageRequest.of(2, 5);	
		
		Page<Role> roles = this.roleRepository.findAll(page);
		
		for (Role role : roles) {
			System.out.println(role.getName());
		}
	}
	
	public void saveRole(String name, StatusRole status) {
		Role role = new Role(name, status);
		roleRepository.save(role);
		
	}
}
